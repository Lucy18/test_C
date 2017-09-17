package Entity;

import java.util.Date;

public class Schedule {
	
	private long flightID;//航班唯一编号
	
	private long startTime;//起飞时间戳
	
	private long endTime;//到达时间戳
	
	private String origin;//起飞机场
	
	private String destination;//到达机场
	
	private String airType;//飞机型号
	
	private String airNum;//飞机尾号
	
	private int duration;//航班经历时间
	
	private Date start;//以正常格式描述起飞时间，yyyy-mm-dd:hh-mm
	
	private Date end;//以正常格式描述到达时间，yyyy-mm-dd:hh-mm
	
	public Schedule(){
		
	}
	
	public Schedule(long flightID, long startTime, long endTime, String origin, String destination, String airType,
			String airNum, int duration, Date start, Date end) {
		super();
		this.flightID = flightID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.origin = origin;
		this.destination = destination;
		this.airType = airType;
		this.airNum = airNum;
		this.duration = duration;
		this.start = start;
		this.end = end;
	}

	public long getFlightID() {
		return flightID;
	}

	public void setFlightID(long flightID) {
		this.flightID = flightID;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAirType() {
		return airType;
	}

	public void setAirType(String airType) {
		this.airType = airType;
	}

	public String getAirNum() {
		return airNum;
	}

	public void setAirNum(String airNum) {
		this.airNum = airNum;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
}
