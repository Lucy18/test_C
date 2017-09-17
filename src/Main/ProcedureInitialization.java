package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Entity.Schedule;
import NetworkEntity.Network;
import NetworkEntity.StationTimeNode;

public class ProcedureInitialization {
	
	private Network net;
	
	private Input in=new Input();
	
	public Network procedureInitialize(){
		
		net=new Network();
		
		ArrayList<Schedule> schList=in.getSchedules();
		
		Map<String,ArrayList<Schedule>> stationMap=new HashMap<String,ArrayList<Schedule>>();
		
		Map<String,ArrayList<Schedule>> aircraftMap=new HashMap<String,ArrayList<Schedule>>();
		
		//遍历schedule的list，将其添加到两个hashmap中
		for(int i=0;i<schList.size();i++){
			
			Schedule s=schList.get(i);		
			String origin=s.getOrigin();
			String aircraft=s.getAirNum();
			
			//add to stationMap
			if(stationMap.containsKey(origin)){
				stationMap.get(origin).add(s);			
			}else{
				ArrayList<Schedule> list=new ArrayList<Schedule>();
				list.add(s);
				stationMap.put(origin, list);
			}	
			
			//add to aircraftMap
			if(aircraftMap.containsKey(aircraft)){
				aircraftMap.get(aircraft).add(s);	
			}else{
				ArrayList<Schedule> list=new ArrayList<Schedule>();
				list.add(s);	
				aircraftMap.put(origin, list);			
			}
		}	
		
		//对每一个机场开始遍历，并生成节点
		Iterator<String> iter=stationMap.keySet().iterator();
		while(iter.hasNext()){
			
			String key=(String)iter.next();
			ArrayList<Schedule> sList=stationMap.get(key);
			
			for(int i=0;i<sList.size();i++){
				
				Schedule s=sList.get(i);
				
				StationTimeNode node=new StationTimeNode();
				
				node.setAircraftType(s.getAirType());
				node.setStation(s.getOrigin());
				
			}
			
		}
		
		return null;
		
	}

	
}
