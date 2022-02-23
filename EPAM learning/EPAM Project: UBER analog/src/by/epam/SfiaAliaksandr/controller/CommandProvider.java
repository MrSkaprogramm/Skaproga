import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import controller.impl.DriverBeginTripCommand;
import controller.impl.DriverGetOnTheLineCommand;
import controller.impl.DriverRegistrationCommand;
import controller.impl.DriverSelectCarCommand;
import controller.impl.OrdersShowHistoryCommand;
import controller.impl.PassengerAddCreditCardCommand;
import controller.impl.PassengerAddPromocodeCommand;
import controller.impl.PassengerBeginTripCommand;
import controller.impl.PassengerRegistrationCommand;
import controller.impl.PassengerSearchCarCommand;
import controller.impl.PassengerSelectPaymentTypeCommand;

public class CommandProvider implements Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = 8013792018474106549L;
  private Map<String, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put("driverGetOnLine", new DriverGetOnTheLineCommand());
		commands.put("driverRegistration", new DriverRegistrationCommand());
		commands.put("passengerRegistration", new PassengerRegistrationCommand());
		commands.put("passengerSearchCar", new PassengerSearchCarCommand());
		commands.put("passengerSelectPaymentType", new PassengerSelectPaymentTypeCommand());
		commands.put("driverSelectCar", new DriverSelectCarCommand());
        commands.put("passengerAddCreditCard", new PassengerAddCreditCardCommand());
        commands.put("passengerAddPromocode", new PassengerAddPromocodeCommand());
        commands.put("driverBeginTrip", new DriverBeginTripCommand());
        commands.put("passengerBeginTrip", new PassengerBeginTripCommand());
        commands.put("ordersShowHistory", new OrdersShowHistoryCommand());
	}
	
	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		
		return command;
	}
}
