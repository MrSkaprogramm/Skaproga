import java.util.Map;
import java.util.Set;
import beans.Driver;
import beans.Rate;

public interface DriverDAO {
	public void registration(Driver newDriver);

    public Set<Driver> getDrivers();

    public Map<String, Rate> getAvailabdleCars();
}
