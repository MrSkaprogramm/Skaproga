import java.io.Serializable;
import controller.Command;
import service.DriverService;
import service.MapService;
import service.PassengerService;
import service.ServiceProvider;

public class DriverGetOnTheLineCommand implements Command, Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = -7810179041292209717L;

  @Override
  public String execute(String[] requestParts) {
    ServiceProvider provider = ServiceProvider.getInstance();
    DriverService driverService = provider.getDriverService();
    PassengerService passengerService = provider.getPassengerService();
    MapService mapService = provider.getMapService();

    boolean passengersThere = passengerService.generatePassengers();

    if (passengersThere) {
      String passangerLocation = mapService.defineLocation();
      String driverLocation = mapService.defineLocation();
      String deliveryAddress = mapService.defineLocation();
      driverService.chooseDriver().getMap().setPassengerLocation(passangerLocation);
      driverService.chooseDriver().getMap().setDriverLocation(driverLocation);
      driverService.chooseDriver().getMap().setDeliveryAddress(deliveryAddress);
      String response = "The nearest passanger is " + mapService.locationDistance(passangerLocation)
          + "away from you";
      return response;
    } else {
      return "There are no passengers near you";
    }
  }
}
