public enum Rate {
	Minimal, 
	Middle, 
	MiddlePlus, 
	Lux;
	
	private double waitingRate;
	private double tripRate;
	private double tripTimeRate;
	
	private Rate() {}

	public double getWaitingRate() {
		return waitingRate;
	}

	public void setWaitingRate(double waitingRate) {
		this.waitingRate = waitingRate;
	}

	public double getTripRate() {
		return tripRate;
	}

	public void setTripRate(double tripRate) {
		this.tripRate = tripRate;
	}

	public double getTripTimeRate() {
		return tripTimeRate;
	}

	public void setTripTimeRate(double tripTimeRate) {
		this.tripTimeRate = tripTimeRate;
	}
}
