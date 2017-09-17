package NetworkEntity;

public class Edge {
	
	private double delayCost;//延迟成本
	
	private StationTimeNode source;//出发的节点
	
	private StationTimeNode target;//到达的节点

	public double getDelayCost() {
		return delayCost;
	}

	public void setDelayCost(double delayCost) {
		this.delayCost = delayCost;
	}

	public StationTimeNode getSource() {
		return source;
	}

	public void setSource(StationTimeNode source) {
		this.source = source;
	}

	public StationTimeNode getTarget() {
		return target;
	}

	public void setTarget(StationTimeNode target) {
		this.target = target;
	}

	
}
