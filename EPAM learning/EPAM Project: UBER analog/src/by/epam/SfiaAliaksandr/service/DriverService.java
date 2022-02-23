import beans.Driver;

public interface DriverService {
  public boolean register(String name, String surname, String legalEntityName);

  public boolean selectCar(String carModel, String carNumber);

  public boolean generateDrivers();

  public Driver chooseDriver();
}
