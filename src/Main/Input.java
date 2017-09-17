package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import Entity.Aircraft;
import Entity.Passenger;
import Entity.Schedule;
import Utils.XLSParser;

public class Input {
	
	XLSParser xlsParser=new XLSParser();
	
	//调用xlsparser的方法，获取所有的飞机信息
	public ArrayList<Aircraft> getAirCrafts(){
		ArrayList<Aircraft> result=new ArrayList<Aircraft>();		
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
				result.add(a);
		}
		return result;
	}
	
	//调用xlsparser的方法，获取所有的旅客信息
	public ArrayList<Passenger> getPassengers(){
		ArrayList<Passenger> result=new ArrayList<Passenger>();		
		String[][] parseS=xlsParser.readExcel("Paxinfo.xlsx", 3);
		for(int i=0;i<parseS.length;i++){
				int passengerNum=Integer.parseInt(parseS[i][0]);
				long flightNum=Long.parseLong(parseS[i][1]);
				int companiedPaxNum=Integer.parseInt(parseS[i][2]);
				Passenger p=new Passenger(passengerNum, flightNum, companiedPaxNum);
				result.add(p);
		}
		return result;
	}
	
	//调用xlsparser的方法，获取所有的行程信息
	public ArrayList<Schedule> getSchedules() {
		ArrayList<Schedule> result = new ArrayList<Schedule>();
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
			result.add(s);
		}
		return result;
	}
	
	//调用xlsparser的方法，获取飞机场关闭的信息
//	public 
	
	//unix时间戳转化为Date
	public Date TimeStamp2Date(String timestampString){ 
		  TimeZone.setDefault(TimeZone.getTimeZone("GMT")); 
		  Long timestamp = Long.parseLong(timestampString)*1000;    
		  Date date=new Date(timestamp);    
		  return date;    
	}  
	
	public static void main(String[] args) {
		Input input=new Input();
		ArrayList<Schedule> re=input.getSchedules();
		System.out.println();
		System.out.println();
	}
}
