package Entity;

import java.util.Date;

public class Aircraft {
	
	private String airType;//飞机型号
	
	private String airNum;//飞机编号
	
	private int startAvailableTime;//最早可用时间，unix格式
	
	private int endAvailableTime;//最晚可用时间，unix格式
	
	private String origin;//起点机场
	
	private int seat;//座位数
	
	private Date startDateTime;//以正常格式描述最早可用时间，yyyy-mm-dd:hh-mm
	
	private Date endDateTime;//以正常格式描述最晚可用时间，yyyy-mm-dd:hh-mm

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

	public int getStartAvailableTime() {
		return startAvailableTime;
	}

	public void setStartAvailableTime(int startAvailableTime) {
		this.startAvailableTime = startAvailableTime;
	}

	public int getEndAvailableTime() {
		return endAvailableTime;
	}

	public void setEndAvailableTime(int endAvailableTime) {
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
