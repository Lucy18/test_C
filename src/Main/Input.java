package Main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

import Entity.Aircraft;
import Entity.Passenger;
import Entity.Schedule;
import Utils.XLSParser;

public class Input {
	
	XLSParser xlsParser=new XLSParser();
	ArrayList<Aircraft> aircrafts;
	ArrayList<Passenger> passengers;
	ArrayList<Schedule> schedules;
	HashMap<String, Aircraft> aircraftMap;
	
	public Input(){
		readAircraftExcel();
		readPassengerExcel();
		readScheduleExcel();
		filter();
	}
	
	public ArrayList<Aircraft> getAirCrafts(){
		return aircrafts;
	}
	
	//调用xlsparser的方法，获取所有的飞机信息
	private void readAircraftExcel(){
		aircrafts=new ArrayList<Aircraft>();	
		aircraftMap=new HashMap<String,Aircraft>();
		String[][] parseS=xlsParser.readExcel("Aircrafts.xlsx", 6);
		for(int i=0;i<parseS.length;i++){
				String airType=parseS[i][1];
				String airNum=parseS[i][0];
				long startAvailableTime=Long.parseLong(parseS[i][2]);
				long endAvailableTime=Long.parseLong(parseS[i][3]);
				Date startDateTime=TimeStamp2Date(parseS[i][2]);
				Date endDateTime=TimeStamp2Date(parseS[i][3]);
				String origin=parseS[i][4];
				int seat=Integer.parseInt(parseS[i][5]);
				Aircraft a=new Aircraft(airType, airNum, startAvailableTime,
						endAvailableTime, origin, seat, startDateTime, endDateTime);
				aircrafts.add(a);
				aircraftMap.put(airNum, a);
		}
	}
		
	public ArrayList<Passenger> getPassengers(){
		return passengers;
	}
	
	//调用xlsparser的方法，获取所有的旅客信息
	private void readPassengerExcel(){
		passengers=new ArrayList<Passenger>();		
		String[][] parseS=xlsParser.readExcel("Paxinfo.xlsx", 3);
		for(int i=0;i<parseS.length;i++){
				int passengerNum=Integer.parseInt(parseS[i][0]);
				long flightNum=Long.parseLong(parseS[i][1]);
				int companiedPaxNum=Integer.parseInt(parseS[i][2]);
				Passenger p=new Passenger(passengerNum, flightNum, companiedPaxNum);
				passengers.add(p);
		}
	}
		
	public ArrayList<Schedule> getSchedules() {
		return schedules;
	}
	
	//调用xlsparser的方法，获取所有的行程信息
	private void readScheduleExcel() {
		schedules = new ArrayList<Schedule>();
		String[][] parseS = xlsParser.readExcel("Schedules.xlsx", 7);
		for (int i = 0; i < parseS.length; i++) {
			long flightID = Long.parseLong(parseS[i][0]);
			long startTime = Long.parseLong(parseS[i][1]);
			long endTime = Long.parseLong(parseS[i][2]);
			Date start = TimeStamp2Date(parseS[i][1]);
			Date end = TimeStamp2Date(parseS[i][2]);
			String origin = parseS[i][3];
			String destination = parseS[i][4];
			String airType = parseS[i][5];
			String airNum = parseS[i][6];
			int duration=(int)(end.getTime()-start.getTime())/(1000*60);		
			Schedule s = new Schedule(flightID, startTime, endTime, origin, 
					destination, airType, airNum, duration,start, end);
			schedules.add(s);
		}
	}

	private void filter(){
		TimeZone.setDefault(TimeZone.getTimeZone("GMT")); 
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//创建日期转换对象HH:mm:ss为时分秒，年月日为yyyy-MM-dd         
		try {
			Date breakTime = df.parse("2016-04-22 18:00:00");
			for(int i=0;i<schedules.size();i++){
				Schedule s=schedules.get(i);
				//18:00前在OVS降落
				if(s.getDestination().equals("OVS")){
					if(s.getEnd().getTime()<breakTime.getTime()){
						Aircraft a=aircraftMap.get(s.getAirNum());
						Date laterAvailableTime=new Date();
						laterAvailableTime.setTime(s.getEnd().getTime() + 45*60*1000);
						if(laterAvailableTime.getTime()>a.getStartDateTime().getTime()){
							a.setStartDateTime(laterAvailableTime);						
							a.setStartAvailableTime(laterAvailableTime.getTime()/1000);
						}
						schedules.remove(i);
						i--;
					}
				}
				//18:00前在OVS起飞
				else if(s.getOrigin().equals("OVS")){
					if(s.getStart().getTime()<breakTime.getTime()){
						Aircraft a=aircraftMap.get(s.getAirNum());
						Date laterAvailableTime=new Date();
						laterAvailableTime.setTime(s.getEnd().getTime() + 45*60*1000);
						if(laterAvailableTime.getTime()>a.getStartDateTime().getTime()){
							a.setStartDateTime(laterAvailableTime);						
							a.setStartAvailableTime(laterAvailableTime.getTime()/1000);
						}
						schedules.remove(i);
						i--;
					}
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//将字符串转换为date类型  
	}
	
	//调用xlsparser的方法，获取飞机场关闭的信息
//	public 
	
	//unix时间戳转化为Date
	private Date TimeStamp2Date(String timestampString){ 
		  TimeZone.setDefault(TimeZone.getTimeZone("GMT")); 
		  Long timestamp = Long.parseLong(timestampString)*1000;    
		  Date date=new Date(timestamp);    
		  return date;    
	}  
	
//	public static void main(String[] args) {
//		Input input=new Input();
//		ArrayList<Aircraft> aircrafts=input.getAirCrafts();
//		for(Aircraft aircraft:aircrafts){
//			System.out.println(aircraft.getAirNum()+"   "+aircraft.getStartDateTime());
//		}
//	}
}
