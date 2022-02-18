import java.util.Objects;

public class Passenger {
	private String clientName;
	private double clientRating;
	private String location;
	
	public Passenger(String clientName) {
		this.clientName = clientName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public double getClientRating() {
		return clientRating;
	}

	public void setClientRating(double clientRating) {
		this.clientRating = clientRating;
	}
	
	

	public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

  @Override
    public int hashCode() {
      return Objects.hash(clientName, clientRating, location);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Passenger other = (Passenger) obj;
      return Objects.equals(clientName, other.clientName)
          && Double.doubleToLongBits(clientRating) == Double.doubleToLongBits(other.clientRating)
          && Objects.equals(location, other.location);
    }

  @Override
	public String toString() {
		return "Passenger [clientName=" + clientName + ", clientRating=" + clientRating + "]";
	}
}
