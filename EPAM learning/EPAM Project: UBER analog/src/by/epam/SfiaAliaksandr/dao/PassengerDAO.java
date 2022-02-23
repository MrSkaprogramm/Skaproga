import java.util.Set;
import beans.Passenger;

public interface PassengerDAO {
	public boolean registration(Passenger newPassenger);

    public Set<Passenger> getPassengers();
}
