import java.io.Serializable;
import java.util.Random;
import beans.Car;
import beans.Driver;
import beans.Rate;
import dao.DAOProvider;
import dao.DriverDAO;
import service.DriverService;
import service.MapService;
import service.ServiceProvider;
import utils.GenerateWord;

public class DriverServiceImpl implements DriverService, Serializable {
  /**
  * 
  */
  private static final long serialVersionUID = -6059357213935499540L;
  private final DAOProvider provider = DAOProvider.getInstance();
	private DriverDAO driverDAO = provider.getDriverDAO();
    private GenerateWord newWord = new GenerateWord();

	@Override
    public boolean register(String name, String surname, String legalEntityName) {
      ServiceProvider instance = new ServiceProvider();
      MapService mapService = instance.getMapService();
      if (name.matches("[a-zA-Z]+") && legalEntityName.matches("[a-zA-Z]+")
          && surname.matches("[a-zA-Z]+")) {
        Driver driver = new Driver(name, surname, legalEntityName);
        driver.getMap().setDriverLocation(mapService.defineLocation());
        driverDAO.getDrivers().add(driver);
        return true;
      } else {
        return false;
      }
	}

    @Override
    public boolean selectCar(String carModel, String carNumber) {
      Driver driver = driverDAO.getDrivers().iterator().next();
      if (driverDAO.getAvailabdleCars().containsKey(carModel)) {
        System.out.println(carModel);
        System.out.println(driverDAO.getAvailabdleCars().get(carModel));
        Rate rate = driverDAO.getAvailabdleCars().get(carModel);
        Car car = new Car(carModel, carNumber, rate);
        driver.setCar(car);
        System.out.println(driver.getCar().getRate().getTripRate());
        System.out.println(driverDAO.getDrivers().iterator().next().getName()
            + driverDAO.getDrivers().iterator().next().getSurname()
            + driverDAO.getDrivers().iterator().next().getCar().getCarModel());
        return true;
      } else {
        System.out.println(driverDAO.getAvailabdleCars().size());
        return false;
      }
    }

    @Override
    public boolean generateDrivers() {
      driverDAO.getDrivers().clear();
      for (int i = 0; i < 5; i++) {
        String driverName = newWord.generateRandomWord();
        String driverSurname = newWord.generateRandomWord();
        String legalEntityName = newWord.generateRandomWord();

        register(driverName, driverSurname, legalEntityName);

        Random generator = new Random();
        Object[] carModels = driverDAO.getAvailabdleCars().keySet().toArray();
        String driverCarModel = (String) carModels[generator.nextInt(carModels.length)];
        String driverCarNumber = newWord.generateRandomWord();
        Rate driverCarRate = driverDAO.getAvailabdleCars().get(driverCarModel);

        for (Driver driver : driverDAO.getDrivers()) {
          if (driver.getName().equalsIgnoreCase(driverName)
              && driver.getSurname().equalsIgnoreCase(driverSurname)) {
            driver.setCar(new Car(driverCarModel, driverCarNumber, driverCarRate));
          }
        }
      }
      
      return true;
    }

    @Override
    public Driver chooseDriver() {
      Driver driver = driverDAO.getDrivers().iterator().next();
      return driver;
    }
}
