package Entity;

import java.util.Date;

public class Schedule {
	
	private int flightID;//航班唯一编号
	
	private int startTime;//起飞时间
	
	private int endTime;//到达时间
	
	private String origin;//起飞机场
	
	private String destination;//到达机场
	
	private String airType;//飞机型号
	
	private String airNum;//飞机尾号
	
	private int duration;//航班经历时间
	
	private Date start;//以正常格式描述起飞时间，yyyy-mm-dd:hh-mm
	
	private Date end;//以正常格式描述到达时间，yyyy-mm-dd:hh-mm

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
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
