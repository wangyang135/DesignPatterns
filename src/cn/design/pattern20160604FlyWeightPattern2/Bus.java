package cn.design.pattern20160604FlyWeightPattern2;

public class Bus {

	private String busNumber;
	
	private String dateTime;
	
	private String driverId;
	
	public Bus(String busNumber, String dateTime, String driverId) {
		super();
		this.busNumber = busNumber;
		this.dateTime = dateTime;
		this.driverId = driverId;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", dateTime=" + dateTime
				+ ", driverId=" + driverId + "]";
	}
	
}
