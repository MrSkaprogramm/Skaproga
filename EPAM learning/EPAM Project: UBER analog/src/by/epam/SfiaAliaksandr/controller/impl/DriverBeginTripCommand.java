import java.io.Serializable;
import beans.Order;
import controller.Command;
import service.OrderService;
import service.PaymentService;
import service.ServiceProvider;

public class DriverBeginTripCommand implements Command, Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -3033805722900435620L;

  @Override
  public String execute(String[] requestParts) {
    ServiceProvider provider = ServiceProvider.getInstance();
    OrderService orderService = provider.getOrderService();
    PaymentService paymentService = provider.getPaymentService();
    
    Order order = orderService.driverTrip();
    String orderResponse = "You have successfully completed the trip in " + order.getTotalTime()
        + " minutes, the total length of the route is " + order.getTotalDistance() + " km";
    String role = "driver";
    String payResponse = paymentService.transaction(order, role);

    return orderResponse + "\n" + payResponse + "\n";
  }
}
