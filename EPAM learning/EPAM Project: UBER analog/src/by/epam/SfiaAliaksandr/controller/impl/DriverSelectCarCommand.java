public class DriverSelectCarCommand implements Command, Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 390752633192517181L;

  @Override
  public String execute(String[] requestParts) {
    ServiceProvider provider = ServiceProvider.getInstance();
    DriverService driverService = provider.getDriverService();

    String carModel = requestParts[1] + " " + requestParts[2];
    String carNumber = requestParts[3];

    boolean result = driverService.selectCar(carModel, carNumber);
    String response;
    if (result) {
      response = "You have chosen your car";
    } else {
      response = "You entered incorrect data. Check it and try again";
    }
    return response;
  }
}
