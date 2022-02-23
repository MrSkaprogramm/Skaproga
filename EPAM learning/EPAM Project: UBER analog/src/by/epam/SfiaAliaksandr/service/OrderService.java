import beans.Order;

public interface OrderService {
    public Order passengerTrip();

    public Order driverTrip();
	
    public boolean makeOrderReport(Order order);
	
	public String showOrdersHistory();
}
