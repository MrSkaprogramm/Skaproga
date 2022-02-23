import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import beans.Driver;
import beans.Rate;
import dao.DriverDAO;
import database.Database;

public class DatabaseDriverDAO implements DriverDAO, Serializable{
	
  /**
  * 
  */
  private static final long serialVersionUID = -1994319876073349620L;
  Database database = new Database();

	public void registration(Driver newDriver) {
		database.getDrivers().add(newDriver);
	}

	@Override
    public Set<Driver> getDrivers() {
		return database.getDrivers();
	}

    @Override
    public Map<String, Rate> getAvailabdleCars() {
      return database.getCarsAvailable();
    }
}
