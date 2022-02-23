import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import beans.Driver;
import beans.Order;
import beans.Passenger;
import beans.Rate;
import utils.DriversSortByDistance;

public class Database implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 2956441734103913058L;
  private Map<String, Double> streets = new HashMap<>();
  private Map<String, Rate> carsAvailable = new HashMap<>();
  private Set<Driver> drivers = new TreeSet<Driver>(new DriversSortByDistance());
  private Set<Passenger> passengers = new TreeSet<>();
  private List<Order> orders = new ArrayList<>();
	
	public Database() {}

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  public Map<String, Double> getStreets() {
		return streets;
	}

	public void setStreets(Map<String, Double> streets) {
		this.streets = streets;
	}

    public Map<String, Rate> getCarsAvailable() {
		return carsAvailable;
	}

    public void setCarsAvailable(Map<String, Rate> carsAvailable) {
		this.carsAvailable = carsAvailable;
	}

    public Set<Driver> getDrivers() {
      return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
      this.drivers = drivers;
    }

    public Set<Passenger> getPassengers() {
      return passengers;
    }

    public void setPassengers(Set<Passenger> passengers) {
      this.passengers = passengers;
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

    @Override
    public int hashCode() {
      return Objects.hash(carsAvailable, drivers, orders, passengers, streets);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Database other = (Database) obj;
      return Objects.equals(carsAvailable, other.carsAvailable)
          && Objects.equals(drivers, other.drivers) && Objects.equals(orders, other.orders)
          && Objects.equals(passengers, other.passengers) && Objects.equals(streets, other.streets);
    }

    @Override
    public String toString() {
      return "Database [streets=" + streets + ", carsAvailable=" + carsAvailable + ", drivers="
          + drivers + ", passengers=" + passengers + ", orders=" + orders + "]";
    }
}
