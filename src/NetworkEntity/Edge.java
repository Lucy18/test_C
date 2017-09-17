package NetworkEntity;

public class Edge {
	
	private double delayCost;//�ӳٳɱ�
	
	private StationTimeNode source;//�����Ľڵ�
	
	private StationTimeNode target;//����Ľڵ�

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
