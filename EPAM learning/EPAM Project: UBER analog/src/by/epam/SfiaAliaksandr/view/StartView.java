import java.io.Serializable;
import java.util.Scanner;

public class StartView implements Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = 464025601375786418L;
  Scanner sc = new Scanner(System.in);
	
	public void logination() {
		System.out.println("You're welcome in AirTaxi service!\nChoose your role:\nPress 1 if you are a Passenger "
							+ "\nor 2 if you are a driver\nor any other number if you want to get out");
		int userName = sc.nextInt();
		if(userName == 1) {
				PassengerOptionView passengerOption = new PassengerOptionView();
				passengerOption.passengerRegistratonMenu();
		}else if(userName == 2) {
			DriverOptionView driverOption = new DriverOptionView();
			driverOption.driverRegistrationMenu();
		}else {
			return;
		}
	}
}
