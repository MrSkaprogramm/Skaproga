import java.io.Serializable;
import java.util.Scanner;
import controller.Controller;
import controller.TaxiController;

public class PassengerOptionView implements Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = 5052861923781559107L;
  Scanner sc = new Scanner(System.in);
	Controller controller = new TaxiController();
	String request;
	String menuAnswer;
	
	public void passengerRegistratonMenu() {
      System.out.println("Hello! Please enter your name:");
		String passengerName = sc.nextLine();
      System.out.println("Please enter your surname:");
      String passengerSurname = sc.nextLine();
		
      request = "passengerRegistration" + " " + passengerName + " " + passengerSurname;
		menuAnswer = controller.doAction(request);

		if(menuAnswer.equalsIgnoreCase("True")) {
			System.out.println("You have successfully registered");
            passengerMenu();
		}else {
            System.out.println("You entered incorrect data. Check it and try again");
            passengerRegistratonMenu();
          }
	}
	
	public void passengerMenu() {
      System.out.println("AirTaxi" + "\n" + "Press 1 to search a car" + "\n"
          + "Press 2 to set your payment type" + "\n" + "Press 3 to add credit card" + "\n"
          + "Press 4 to add promocode" + "\n" + "Press 5 to show order history" + "\n"
          + "Press any other number to exit");
		int choise = sc.nextInt();
		if(choise == 1) {
			System.out.println("Enter your destination ddress:");
            sc.nextLine();
			String destinationAddress = sc.nextLine();
            request = "passengerSearchCar" + " " + destinationAddress;
			menuAnswer = controller.doAction(request);
			System.out.println(menuAnswer);
			if(menuAnswer.equalsIgnoreCase("You entered an incorrect delivery address") || menuAnswer.equalsIgnoreCase("There are no passengers near you")) {
			  passengerMenu();
			}else {
              System.out.println("Do you want to confirm the trip?" + "\n"
                  + "Press 1 to confirm the trip" + "\n" + "Press 2 to cancel the trip");
              int takeOrder = sc.nextInt();
              if(takeOrder == 1) {
                request = "passengerBeginTrip";
                menuAnswer = controller.doAction(request);
                System.out.println(menuAnswer);
                passengerMenu();
              }else if(takeOrder == 2) {
                passengerMenu();
              }
            }
		}else if(choise == 2) {
          System.out.println("Select your payment type" + "\n" + "Press 1 to choose cash" + "\n"
              + "Press 2 to choose credit card:");
			String paymentType = null;
            int choosePaymentType = sc.nextInt();
			if(choosePaymentType == 1) {
				paymentType = "cash";
			}else if(choosePaymentType == 2){
              paymentType = "creditcard";
			}
			
            request = "passengerSelectPaymentType" + " " + paymentType;
			menuAnswer = controller.doAction(request);
			System.out.println(menuAnswer);
			passengerMenu();
          } else if (choise == 3) {
			System.out.println("Enter your credit card's number:");
			int cardNum = sc.nextInt();
			System.out.println("Enter your credit card's expiring date:");
            sc.nextLine();
			String expiringDate = sc.nextLine();
			
			request = "passengerAddCreditCard" + " " + cardNum + " " + expiringDate;
			menuAnswer = controller.doAction(request);
			System.out.println(menuAnswer);
			passengerMenu();
          } else if (choise == 4) {
            sc.nextLine();
			System.out.println("Enter your promocode's number:");
            String promocodeNum = sc.nextLine();
			
			request = "passengerAddPromocode" + " " + promocodeNum;
			menuAnswer = controller.doAction(request);
			System.out.println(menuAnswer);
			passengerMenu();
          } else if (choise == 5) {
            request = "ordersShowHistory";
            menuAnswer = controller.doAction(request);
            System.out.println(menuAnswer);
            passengerMenu();
		}else {
          System.out.println("Have a nice day!");
			return;
		}
	}
}
