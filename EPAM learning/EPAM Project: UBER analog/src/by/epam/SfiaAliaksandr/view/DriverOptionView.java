import java.io.Serializable;
import java.util.Scanner;
import controller.Controller;
import controller.TaxiController;

public class DriverOptionView implements Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = 6997231315130524811L;
  Scanner sc = new Scanner(System.in);
	Controller controller = new TaxiController();
	String request;
	String menuAnswer;
	
	public void driverRegistrationMenu() {
      System.out.println("Enter please your name:");
		String driverName = sc.nextLine();
      System.out.println("Enter please your surname:");
      String driverSurame = sc.nextLine();
		System.out.println("Enter please your legal entity name:");
		String legalEntityName = sc.nextLine();
		
        request =
            "driverRegistration" + " " + driverName + " " + driverSurame + " " + legalEntityName;
        menuAnswer = controller.doAction(request);
        if (menuAnswer.equalsIgnoreCase("True")) {
          System.out.println("You have successfully registered");
          driverMenu();
        } else {
          System.out.println("You entered incorrect data. Check it and try again");
          driverRegistrationMenu();
        }
	}
	
	public void driverMenu() {
      System.out.println("AirTaxi" + "\n" + "Press 1 to get on the line" + "\n"
          + "Press 2 to select car" + "\n" + "Press 3 to show order history" + "\n"
          + "Press any other number to exit");
		int choise = sc.nextInt();
		if(choise == 1) {
			request = "driverGetOnLine";
			menuAnswer = controller.doAction(request);
			System.out.println(menuAnswer);
            if (menuAnswer.equalsIgnoreCase("There are no passengers near you")) {
              driverMenu();
            } else {
              System.out.println("Do you want to take an order?" + "\n" + "Press 1 to get an order"
                  + "\n" + "Press 2 to cancel an order");
              int takeOrder = sc.nextInt();
              if (takeOrder == 1) {
                request = "driverBeginTrip";
                menuAnswer = controller.doAction(request);
                System.out.println(menuAnswer);
                driverMenu();
              } else if (takeOrder == 2) {
                request = "ordersShowHistory";
                menuAnswer = controller.doAction(request);
                System.out.println(menuAnswer);
                driverMenu();
              }
            }
		}else if(choise == 2) {
			System.out.println("Enter your car's model:");
            sc.nextLine();
			String carModel = sc.nextLine();
			System.out.println("Enter your car's number:");
			String carNumber = sc.nextLine();
			request = "driverSelectCar" + " " + carModel + " " + carNumber;
			menuAnswer = controller.doAction(request);
			System.out.println(menuAnswer);
            driverMenu();
		}else if(choise == 3) {
          request = "ordersShowHistory";
          menuAnswer = controller.doAction(request);
          System.out.println(menuAnswer);
          driverMenu();
		}else {
          System.out.println("Have a nice day!");
			return;
		}
	}
}
