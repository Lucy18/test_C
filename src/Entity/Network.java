package Entity;

import java.util.ArrayList;

public class Network {
	
	//所有点的集合，包括中间节点和沉没节点
	private ArrayList<StationTimeNode> nodeList;
	
	//所有边的集合，边的内容包括它的起点和终点
	private ArrayList<Edge> edgeList;

	public ArrayList<StationTimeNode> getNodeList() {
		return nodeList;
	}

	public void setNodeList(ArrayList<StationTimeNode> nodeList) {
		this.nodeList = nodeList;
	}

	public ArrayList<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(ArrayList<Edge> edgeList) {
		this.edgeList = edgeList;
	}

}
