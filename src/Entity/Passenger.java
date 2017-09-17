package Entity;

public class Passenger {
	
	private int passengerNum;//旅客编号
	
	private int flightNum;//航班编号
	
	private int companiedPaxNum;//同行旅客数量

	public int getPassengerNum() {
		return passengerNum;
	}

	public void setPassengerNum(int passengerNum) {
		this.passengerNum = passengerNum;
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}

	public int getCompaniedPaxNum() {
		return companiedPaxNum;
	}

	public void setCompaniedPaxNum(int companiedPaxNum) {
		this.companiedPaxNum = companiedPaxNum;
	}

	
}
