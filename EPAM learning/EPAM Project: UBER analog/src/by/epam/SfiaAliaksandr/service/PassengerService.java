import beans.Passenger;

public interface PassengerService {
    public boolean register(String name, String surname);

    public boolean generatePassengers();

    public String selectPaymentType(String type);

    public Passenger choosePassenger();
}
