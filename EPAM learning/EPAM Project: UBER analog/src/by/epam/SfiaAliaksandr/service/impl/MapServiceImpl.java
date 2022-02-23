import java.io.Serializable;
import java.util.Random;
import dao.DAOProvider;
import dao.MapDAO;
import service.MapService;

public class MapServiceImpl implements MapService, Serializable {

  /**
  * 
  */
  private static final long serialVersionUID = -2109708074976176253L;
  private final DAOProvider provider = DAOProvider.getInstance();
    private MapDAO mapDAO = provider.getMapDAO();

    public boolean checkLocation(String street) {
      if (mapDAO.getStreets().containsKey(street)) {
        return true;
      } else {
        return false;
      }
	}

    @Override
    public String defineLocation() {
      Random generator = new Random();
      Object[] streets = mapDAO.getStreets().keySet().toArray();
      String location = (String) streets[generator.nextInt(streets.length)];
      return location;
    }

    @Override
    public double locationDistance(String street) {
      return mapDAO.getStreets().get(street);
    }

    @Override
    public double calculateTripDistance(String passengerLocation, String deliveryAddress) {
      return locationDistance(passengerLocation) + locationDistance(deliveryAddress);
    }
}
