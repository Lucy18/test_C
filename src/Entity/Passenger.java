package Entity;

public class Passenger {
	
	private int passengerNum;//旅客编号
	
	private long flightNum;//航班编号
	
	private int companiedPaxNum;//同行旅客数量

	public Passenger(){
		
	}
	
	public Passenger(int passengerNum, long flightNum, int companiedPaxNum) {
		super();
		this.passengerNum = passengerNum;
		this.flightNum = flightNum;
		this.companiedPaxNum = companiedPaxNum;
	}

	public int getPassengerNum() {
		return passengerNum;
	}

	public void setPassengerNum(int passengerNum) {
		this.passengerNum = passengerNum;
	}

	public long getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(long flightNum) {
		this.flightNum = flightNum;
	}

	public int getCompaniedPaxNum() {
		return companiedPaxNum;
	}

	public void setCompaniedPaxNum(int companiedPaxNum) {
		this.companiedPaxNum = companiedPaxNum;
	}

	
}
