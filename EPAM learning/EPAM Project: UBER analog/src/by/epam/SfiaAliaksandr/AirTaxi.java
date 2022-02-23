import java.io.Serializable;
import database.Initialization;
import view.StartView;

public class AirTaxi implements Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = 4809843886266293873L;

  public static void main(String[] args) {
		Initialization dataInit = new Initialization();
		dataInit.initStreetsDatabase();
    dataInit.initCarsDatabase();
		StartView loginationView = new StartView();
		loginationView.logination();
	}
}
