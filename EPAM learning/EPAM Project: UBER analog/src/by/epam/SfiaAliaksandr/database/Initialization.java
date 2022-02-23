import java.io.Serializable;
import beans.Rate;
import dao.DAOProvider;
import dao.DriverDAO;
import dao.MapDAO;

public class Initialization implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = -3552572071357717609L;
  private final DAOProvider provider = DAOProvider.getInstance();
  private DriverDAO driverDAO = provider.getDriverDAO();
  private MapDAO mapDAO = provider.getMapDAO();
	
	public void initStreetsDatabase() {
    mapDAO.getStreets().put("Aivazovsky", 6.5);
    mapDAO.getStreets().put("Angarsk", 11.8);
    mapDAO.getStreets().put("Ales Dudara", 8.2);
    mapDAO.getStreets().put("Arkady Smolich", 8.4);
    mapDAO.getStreets().put("Avtodorovskaya", 4.9);
    mapDAO.getStreets().put("Alibegova", 6.7);
    mapDAO.getStreets().put("Avakyan", 3.9);
    mapDAO.getStreets().put("Independence Ave", 6.4);
    mapDAO.getStreets().put("Avangardnaya", 6.3);
    mapDAO.getStreets().put("Vaupshasova", 7.8);
    mapDAO.getStreets().put("Academician Vysotsky", 7.8);
    mapDAO.getStreets().put("Kalinina", 4.8);
    mapDAO.getStreets().put("Melezha", 3.7);
    mapDAO.getStreets().put("Yakub Kolas", 5.8);
    mapDAO.getStreets().put("Mazurova", 10.9);
    mapDAO.getStreets().put("Briquette", 10.7);
    mapDAO.getStreets().put("International", 0.4);
    mapDAO.getStreets().put("Ratomskaya", 9.0);
	}
	
    public void initCarsDatabase() {
      driverDAO.getAvailabdleCars().put("VW POLO", Rate.Minimal);
      driverDAO.getAvailabdleCars().put("Renault Logan", Rate.Minimal);
      driverDAO.getAvailabdleCars().put("KIA RIO", Rate.Minimal);
      driverDAO.getAvailabdleCars().put("CITROEN C3", Rate.Minimal);
      driverDAO.getAvailabdleCars().put("Honda Accord", Rate.Middle);
      driverDAO.getAvailabdleCars().put("VW PASSAT", Rate.Middle);
      driverDAO.getAvailabdleCars().put("TOYOTA CAMRY", Rate.Middle);
      driverDAO.getAvailabdleCars().put("JAGUAR XF", Rate.MiddlePlus);
      driverDAO.getAvailabdleCars().put("AUDI A5", Rate.MiddlePlus);
      driverDAO.getAvailabdleCars().put("MERCEDES S600", Rate.Lux);
      driverDAO.getAvailabdleCars().put("TESLA MODELS", Rate.Lux);
	}
}
