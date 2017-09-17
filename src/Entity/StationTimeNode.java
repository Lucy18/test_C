package Entity;

import java.util.ArrayList;

public  class StationTimeNode{
	
	private int type;//节点分类
	
	private int num;//节点编号
	
	private int mark;//节点mark值
	
	private int indegree;//节点入度
	
	private int outdegree;//节点出度
	
	private String station;//机场
	
	private String aircraftType;//飞机型号，前两问可以不填
	
	private int availableTime;//可用时间
	
	//这样等于点要包含边，边又包含了点，重复嵌套不觉得奇怪吗
	private ArrayList<Edge> inEdgeList;//以该点为终点的边的集合
	
	private ArrayList<Edge> outEdgeList;//以该点为起点的边的集合

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