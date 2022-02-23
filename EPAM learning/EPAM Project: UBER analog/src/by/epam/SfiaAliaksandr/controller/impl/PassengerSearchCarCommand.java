import java.io.Serializable;
import controller.Command;
import service.DriverService;
import service.MapService;
import service.PassengerService;
import service.ServiceProvider;

public class PassengerSearchCarCommand implements Command, Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 8859949488044676289L;

  public String execute(String[] requestParts) {
		ServiceProvider provider = ServiceProvider.getInstance();
        DriverService driverService = provider.getDriverService();
        PassengerService passengerService = provider.getPassengerService();
        MapService mapService = provider.getMapService();

        String deliveryAddress = requestParts[1];
        boolean checkDeliveryAddress = mapService.checkLocation(deliveryAddress);
        boolean driversThere = driverService.generateDrivers();

        if (driversThere && checkDeliveryAddress) {
          String passengerLocation = mapService.defineLocation();
          String driverLocation = mapService.defineLocation();
          passengerService.choosePassenger().getMap().setDriverLocation(driverLocation);
          passengerService.choosePassenger().getMap().setDeliveryAddress(deliveryAddress);
          passengerService.choosePassenger().getMap().setPassengerLocation(passengerLocation);;
          String response = "The nearest driver is " + mapService.locationDistance(driverLocation)
              + " away from you";
          return response;
        } else if (!checkDeliveryAddress) {
          return "You entered an incorrect delivery address";
        } else {
          return "There are no passengers near you";
        }
	}
}
