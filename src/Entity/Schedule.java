package Entity;

import java.util.Date;

public class Schedule {
	
	private int flightID;//����Ψһ���
	
	private int startTime;//���ʱ��
	
	private int endTime;//����ʱ��
	
	private String origin;//��ɻ���
	
	private String destination;//�������
	
	private String airType;//�ɻ��ͺ�
	
	private String airNum;//�ɻ�β��
	
	private int duration;//���ྭ��ʱ��
	
	private Date start;//��������ʽ�������ʱ�䣬yyyy-mm-dd:hh-mm
	
	private Date end;//��������ʽ��������ʱ�䣬yyyy-mm-dd:hh-mm

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
