import java.io.Serializable;
import controller.Command;
import service.PaymentService;
import service.ServiceProvider;

public class PassengerAddCreditCardCommand implements Command, Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 719853910613940070L;

  @Override
  public String execute(String[] requestParts) {
    ServiceProvider provider = ServiceProvider.getInstance();
    PaymentService paymentService = provider.getPaymentService();

    int creditCardNum = Integer.valueOf(requestParts[1]);
    String expiringDate = requestParts[2];

    boolean result = paymentService.addCreditCard(creditCardNum, expiringDate);
    String response;
    if (result) {
      response = "You have successfully added a credit card";
    } else {
      response = "You entered incorrect data. Check it and try again";
    }
    return response;
  }
}
