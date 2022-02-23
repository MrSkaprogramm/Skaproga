import java.io.Serializable;
import controller.Command;
import service.DriverService;
import service.ServiceProvider;

public class DriverRegistrationCommand implements Command, Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -7240230197639180652L;

  @Override
  public String execute(String[] requestParts) {
    ServiceProvider provider = ServiceProvider.getInstance();
    DriverService driverService = provider.getDriverService();

    String driverName = requestParts[1];
    String driverSurname = requestParts[2];
    String driverLegalEntityName = requestParts[3];

    boolean result = driverService.register(driverName, driverSurname, driverLegalEntityName);

    if (result) {
      return "True";
    } else {
      return "False";
    }
  }
}
