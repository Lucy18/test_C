package NetworkEntity;

import java.util.ArrayList;

public class Network {
	
	//���е�ļ��ϣ������м�ڵ�ͳ�û�ڵ�
	private ArrayList<StationTimeNode> nodeList;
	
	//���бߵļ��ϣ��ߵ����ݰ������������յ�
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
