import java.io.Serializable;
import controller.Command;
import service.PaymentService;
import service.ServiceProvider;

public class PassengerAddPromocodeCommand implements Command, Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 7504760908308727064L;

  @Override
  public String execute(String[] requestParts) {
    ServiceProvider provider = ServiceProvider.getInstance();
    PaymentService paymentService = provider.getPaymentService();

    String promocodeNum = requestParts[1];
    int discount = Integer.valueOf((int) Math.random() * 100);

    boolean result = paymentService.addPromocode(promocodeNum, discount);

    String response;
    if (result) {
      response = "You have successfully added a promocode";
    } else {
      response = "You entered incorrect data. Check it and try again";
    }
    return response;
  }
}
