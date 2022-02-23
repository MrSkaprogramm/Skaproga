import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import beans.Driver;
import beans.NavigationMap;
import beans.Order;
import beans.Passenger;
import beans.Payment;
import dao.DAOProvider;
import dao.OrderDAO;
import service.DriverService;
import service.MapService;
import service.OrderService;
import service.PassengerService;
import service.ServiceProvider;

public class OrderServiceImpl implements OrderService, Serializable{
  private final DAOProvider instance = new DAOProvider();
  private OrderDAO orderDAO = instance.getOrderDAO();
  /**
  * 
  */
  private static final long serialVersionUID = -5253906690789869374L;

    @Override
    public Order passengerTrip() {
      ServiceProvider instance = ServiceProvider.getInstance();
      MapService mapService = instance.getMapService();
      PassengerService passengerService = instance.getPassengerService();
      DriverService driverService = instance.getDriverService();
      Passenger passsenger = passengerService.choosePassenger();
      Driver driver = driverService.chooseDriver();

      Order order = new Order(new Payment(), passsenger, driver, new NavigationMap());

      LocalDateTime currentDate = LocalDateTime.now();
      order.setOrderTime(currentDate);
      order.setTotalDistance(mapService.calculateTripDistance(
          passsenger.getMap().getPassengerLocation(), passsenger.getMap().getDriverLocation()));
      order.setTotalTime(Math.random() * 30);
      order.setTotalWaitingTime(Math.random() * 5);
      orderDAO.getOrders().add(order);

      makeOrderReport(order);
      return order;
	}

    @Override
    public Order driverTrip() {
      ServiceProvider instance = ServiceProvider.getInstance();
      MapService mapService = instance.getMapService();
      PassengerService passengerService = instance.getPassengerService();
      DriverService driverService = instance.getDriverService();
      Passenger passsenger = passengerService.choosePassenger();
      Driver driver = driverService.chooseDriver();

      Order order = new Order(new Payment(), passsenger, driver, new NavigationMap());

      LocalDateTime currentDate = LocalDateTime.now();
      order.setOrderTime(currentDate);
      order.setTotalDistance(mapService.calculateTripDistance(
          driver.getMap().getPassengerLocation(), driver.getMap().getDriverLocation()));
      order.setTotalTime(Math.random() * 30);
      order.setTotalWaitingTime(Math.random() * 5);
      orderDAO.getOrders().add(order);

      makeOrderReport(order);
      return order;
    }
	
	@Override
    public boolean makeOrderReport(Order order) {
      File file = new File(Paths.get("").toAbsolutePath().toString(), "TaxiOrders.txt");
      if (!file.exists()) {
        try {
          file.createNewFile();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

      try (FileOutputStream addOrder = new FileOutputStream(file);
          ObjectOutputStream addOrderObj = new ObjectOutputStream(addOrder);) {
        addOrderObj.writeObject(order);
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return true;
	}
	
	@Override
	public String showOrdersHistory() {
      File file = new File(Paths.get("").toAbsolutePath().toString(), "TaxiOrders.txt");
      StringBuilder reportsString = new StringBuilder();
      try (FileInputStream readOrder = new FileInputStream(file);
          ObjectInputStream readOrderObj = new ObjectInputStream(readOrder);) {
        for (int i = 0; i < orderDAO.getOrders().size(); i++) {
          Order order = (Order) readOrderObj.readObject();
          reportsString
              .append("Order date: " + order.getOrderTime().toString() + "\n" + "Total time: "
                  + order.getTotalTime() + "minutes" + "\n" + "Driver name: "
                  + order.getDriver().getName() + "\n" + "Car number: "
                  + order.getDriver().getCar().getCarNumber() + "\n" + "Passenger name: "
                  + order.getPassenger().getName() + "\n");
        }
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
      return reportsString.toString();
    }
}
