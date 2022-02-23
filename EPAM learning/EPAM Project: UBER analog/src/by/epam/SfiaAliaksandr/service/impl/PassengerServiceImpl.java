import java.io.Serializable;
import beans.Passenger;
import dao.DAOProvider;
import dao.PassengerDAO;
import service.MapService;
import service.PassengerService;
import service.ServiceProvider;
import utils.GenerateWord;

public class PassengerServiceImpl implements PassengerService, Serializable {

  /**
  * 
  */
  private static final long serialVersionUID = 2021306037806158326L;
  private final DAOProvider provider = DAOProvider.getInstance();
	private PassengerDAO passengerDAO = provider.getPassengerDAO();
    private GenerateWord newWord = new GenerateWord();

    @Override
    public String selectPaymentType(String type) {
      Passenger passenger = passengerDAO.getPassengers().iterator().next();
      if (type.equalsIgnoreCase("CreditCard") && passenger.getPayment().getCreditCard() == null) {
        return "Please add a credit card";
      } else if (type.equalsIgnoreCase("CreditCard")) {
        passenger.setPaymentType(type);
        return "You have chosen the credit card payment method";
      } else if (type.equalsIgnoreCase("Cash")) {
        passenger.setPaymentType(type);
        return "You have chosen the cash payment method";
      } else {
        return "You entered incorrect data. Check it and try again";
      }
    }

    @Override
    public boolean generatePassengers() {
      passengerDAO.getPassengers().clear();
      for (int i = 0; i < 5; i++) {
        String passengerName = newWord.generateRandomWord();
        String passengerSurname = newWord.generateRandomWord();

        register(passengerName, passengerSurname);
      }

      return true;
    }

    @Override
    public boolean register(String name, String surname) {
      ServiceProvider instance = new ServiceProvider();
      MapService mapService = instance.getMapService();
      if (name.matches("[a-zA-Z]+") && surname.matches("[a-zA-Z]+")) {
        Passenger passenger = new Passenger(name, surname);
        passenger.getMap().setPassengerLocation(mapService.defineLocation());
        passengerDAO.getPassengers().add(passenger);
        return true;
      } else {
        return false;
      }
    }

    @Override
    public Passenger choosePassenger() {
      return passengerDAO.getPassengers().iterator().next();
    }
}
