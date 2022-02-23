import java.io.Serializable;
import java.util.Set;
import beans.Passenger;
import dao.PassengerDAO;
import database.Database;

public class DatabasePassengerDAO implements PassengerDAO, Serializable {

  /**
  * 
  */
  private static final long serialVersionUID = 2828911934054069136L;
  Database database = new Database();
	
	public boolean registration(Passenger newPassenger) {
		return database.getPassengers().add(newPassenger);
		
	}

    public Set<Passenger> getPassengers() {
		return database.getPassengers();
	}
}
