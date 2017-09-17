package NetworkEntity;

import java.util.ArrayList;

public  class StationTimeNode{
	
	private int type;//�ڵ����
	
	private int num;//�ڵ���
	
	private int mark;//�ڵ�markֵ
	
	private int indegree;//�ڵ����
	
	private int outdegree;//�ڵ����
	
	private String station;//����
	
	private String aircraftType;//�ɻ��ͺţ�ǰ���ʿ��Բ���
	
	private int availableTime;//����ʱ��
	
	//�������ڵ�Ҫ�����ߣ����ְ����˵㣬�ظ�Ƕ�ײ����������
	private ArrayList<Edge> inEdgeList;//�Ըõ�Ϊ�յ�ıߵļ���
	
	private ArrayList<Edge> outEdgeList;//�Ըõ�Ϊ���ıߵļ���

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getIndegree() {
		return indegree;
	}

	public void setIndegree(int indegree) {
		this.indegree = indegree;
	}

	public int getOutdegree() {
		return outdegree;
	}

	public void setOutdegree(int outdegree) {
		this.outdegree = outdegree;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public int getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(int availableTime) {
		this.availableTime = availableTime;
	}
	
	
	
}