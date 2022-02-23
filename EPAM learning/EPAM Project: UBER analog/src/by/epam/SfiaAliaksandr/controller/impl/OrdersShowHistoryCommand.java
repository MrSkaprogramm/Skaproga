import java.io.Serializable;
import controller.Command;
import service.OrderService;
import service.ServiceProvider;

public class OrdersShowHistoryCommand implements Command, Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = -7825880820949641873L;

  @Override
  public String execute(String[] requestParts) {
    ServiceProvider provider = ServiceProvider.getInstance();
    OrderService orderService = provider.getOrderService();

    String response = orderService.showOrdersHistory();
    return response;
  }
}
