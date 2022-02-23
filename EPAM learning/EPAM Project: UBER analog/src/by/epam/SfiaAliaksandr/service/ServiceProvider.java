import java.io.Serializable;
import service.impl.DriverServiceImpl;
import service.impl.MapServiceImpl;
import service.impl.OrderServiceImpl;
import service.impl.PassengerServiceImpl;
import service.impl.PaymentServiceImpl;

public class ServiceProvider implements Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = -113015368231023276L;

  private static final ServiceProvider instance = new ServiceProvider();
	
	private final PassengerService passengerService = new PassengerServiceImpl();
	private final MapService mapService = new MapServiceImpl();
	private final DriverService driverService = new DriverServiceImpl();
	private final OrderService orderService = new OrderServiceImpl();
	private final PaymentService paymentService = new PaymentServiceImpl();
	
	public ServiceProvider() {}

	public PassengerService getPassengerService() {
		return passengerService;
	}

	public MapService getMapService() {
		return mapService;
	}

	public DriverService getDriverService() {
		return driverService;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	public static ServiceProvider getInstance() {
		return instance;
	}
}
