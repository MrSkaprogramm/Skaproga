import java.io.Serializable;
import dao.impl.DatabaseDriverDAO;
import dao.impl.DatabaseMapDAO;
import dao.impl.DatabaseOrderDAO;
import dao.impl.DatabasePassengerDAO;

public class DAOProvider implements Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = -5483235816758692809L;

  private static final DAOProvider instance = new DAOProvider();
	
	private PassengerDAO passengerDAO = new DatabasePassengerDAO();
	private DriverDAO driverDAO = new DatabaseDriverDAO();
	private MapDAO mapDAO = new DatabaseMapDAO();
    private OrderDAO orderDAO = new DatabaseOrderDAO();
	
	public DAOProvider() {}

	public static DAOProvider getInstance() {
		return instance;
	}
	
	public PassengerDAO getPassengerDAO() {
		return passengerDAO;
	}

	public void setPassengerDAO(PassengerDAO passengerDAO) {
		this.passengerDAO = passengerDAO;
	}

	public DriverDAO getDriverDAO() {
		return driverDAO;
	}

	public void setDriverDAO(DriverDAO driverDAO) {
		this.driverDAO = driverDAO;
	}

	public MapDAO getMapDAO() {
		return mapDAO;
	}

	public void setMapDAO(MapDAO mapDAO) {
		this.mapDAO = mapDAO;
      }

      public OrderDAO getOrderDAO() {
        return orderDAO;
      }

      public void setOrderDAO(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
      }
}
