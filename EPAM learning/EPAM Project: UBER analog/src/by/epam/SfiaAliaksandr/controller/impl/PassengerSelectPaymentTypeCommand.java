import java.io.Serializable;
import controller.Command;
import service.PassengerService;
import service.ServiceProvider;

public class PassengerSelectPaymentTypeCommand implements Command, Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 269162128961795783L;

  public String execute(String[] requestParts) {
		ServiceProvider provider = ServiceProvider.getInstance();
        PassengerService passengerService = provider.getPassengerService();
        String type = requestParts[1];
		
        String response = passengerService.selectPaymentType(type);
		return response;
	}
}
