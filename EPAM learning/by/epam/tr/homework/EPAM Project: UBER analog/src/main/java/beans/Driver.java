public class Driver {
	private String driverName;
	private double driverRating;
	private String location;
	private String legalEntityName;
	private Car car;
	private double money;
	
	public Driver(String driverName, String legalEntityName) {
		this.driverName = driverName;
		this.legalEntityName = legalEntityName;
	}

	public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getDriverRating() {
		return driverRating;
	}

	public void setDriverRating(double driverRating) {
		this.driverRating = driverRating;
	}

	public String getLegalEntityName() {
		return legalEntityName;
	}

	public void setLegalEntityName(String legalEntityName) {
		this.legalEntityName = legalEntityName;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result + ((driverName == null) ? 0 : driverName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(driverRating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((legalEntityName == null) ? 0 : legalEntityName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (driverName == null) {
			if (other.driverName != null)
				return false;
		} else if (!driverName.equals(other.driverName))
			return false;
		if (Double.doubleToLongBits(driverRating) != Double.doubleToLongBits(other.driverRating))
			return false;
		if (legalEntityName == null) {
			if (other.legalEntityName != null)
				return false;
		} else if (!legalEntityName.equals(other.legalEntityName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", driverRating=" + driverRating + ", legalEntityName="
				+ legalEntityName + ", car=" + car + "]";
	}
}
