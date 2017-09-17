package Entity;

import java.util.Date;

public class Aircraft {
	
	private String airType;//�ɻ��ͺ�
	
	private String airNum;//�ɻ����
	
	private int startAvailableTime;//�������ʱ�䣬unix��ʽ
	
	private int endAvailableTime;//�������ʱ�䣬unix��ʽ
	
	private String origin;//������
	
	private int seat;//��λ��
	
	private Date startDateTime;//��������ʽ�����������ʱ�䣬yyyy-mm-dd:hh-mm
	
	private Date endDateTime;//��������ʽ�����������ʱ�䣬yyyy-mm-dd:hh-mm

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
