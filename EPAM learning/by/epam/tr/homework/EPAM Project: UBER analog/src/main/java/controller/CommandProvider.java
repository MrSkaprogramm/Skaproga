import java.util.HashMap;
import java.util.Map;
import controller.impl.DriverGetOnTheLineCommand;
import controller.impl.DriverRegistrationCommand;
import controller.impl.DriverSelectCarCommand;
import controller.impl.DriverShowMoneyRatingCommand;
import controller.impl.PassengerAddCreditCard;
import controller.impl.PassengerAddPromocode;
import controller.impl.PassengerRegistrationCommand;
import controller.impl.PassengerSearchCarCommand;
import controller.impl.PassengerSelectPaymentTypeCommand;
import controller.impl.PassengerShowRatesCommand;
import controller.impl.PassengerShowRatingCommand;
import controller.impl.WithdrawDriverMoneyCommand;

public class CommandProvider {
	private Map<String, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put("driverGetOnLine", new DriverGetOnTheLineCommand());
		commands.put("driverRegistration", new DriverRegistrationCommand());
		commands.put("driverShowMoneyRating", new DriverShowMoneyRatingCommand());
		commands.put("passengerRegistration", new PassengerRegistrationCommand());
		commands.put("passengerSearchCar", new PassengerSearchCarCommand());
		commands.put("passengerSelectPaymentType", new PassengerSelectPaymentTypeCommand());
		commands.put("passengerShowRates", new PassengerShowRatesCommand());
		commands.put("passengerShowRating", new PassengerShowRatingCommand());
		commands.put("driverSelectCar", new DriverSelectCarCommand());
		commands.put("driverWithdrawMoney", new WithdrawDriverMoneyCommand());
		commands.put("passengerAddCreditCard", new PassengerAddCreditCard());
		commands.put("passengerAddPromocode", new PassengerAddPromocode());
	}
	
	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		
		return command;
	}
}
