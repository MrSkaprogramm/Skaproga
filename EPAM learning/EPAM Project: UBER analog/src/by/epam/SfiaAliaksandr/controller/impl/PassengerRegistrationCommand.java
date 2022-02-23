import java.io.Serializable;
import controller.Command;
import service.PassengerService;
import service.ServiceProvider;

public class PassengerRegistrationCommand implements Command, Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 6827260278170842772L;

  @Override
  public String execute(String[] requestParts) {
    ServiceProvider provider = ServiceProvider.getInstance();
    PassengerService passengerService = provider.getPassengerService();

    String passengerName = requestParts[1];
    String passengerSurname = requestParts[2];

    boolean result = passengerService.register(passengerName, passengerSurname);

    if (result) {
      return "True";
    } else {
      return "False";
    }
  }
}
