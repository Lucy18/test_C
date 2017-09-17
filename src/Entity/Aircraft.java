package Entity;

import java.util.Date;

public class Aircraft {
	
	private String airType;//飞机型号
	
	private String airNum;//飞机尾号
	
	private long startAvailableTime;//最早可用时间，unix格式
	
	private long endAvailableTime;//最晚可用时间，unix格式
	
	private String origin;//起点机场
	
	private int seat;//座位数
	
	private Date startDateTime;//以正常格式描述最早可用时间，yyyy-mm-dd:hh-mm
	
	private Date endDateTime;//以正常格式描述最晚可用时间，yyyy-mm-dd:hh-mm


	public Aircraft(){
		
	}
	
	public Aircraft(String airType, String airNum, long startAvailableTime, long endAvailableTime, String origin,
			int seat, Date startDateTime, Date endDateTime) {
		super();
		this.airType = airType;
		this.airNum = airNum;
		this.startAvailableTime = startAvailableTime;
		this.endAvailableTime = endAvailableTime;
		this.origin = origin;
		this.seat = seat;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
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

	public long getStartAvailableTime() {
		return startAvailableTime;
	}

	public void setStartAvailableTime(long startAvailableTime) {
		this.startAvailableTime = startAvailableTime;
	}

	public long getEndAvailableTime() {
		return endAvailableTime;
	}

	public void setEndAvailableTime(long endAvailableTime) {
		this.endAvailableTime = endAvailableTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	
}
