public interface MapService {
  public String defineLocation();
	
  public boolean checkLocation(String street);
	
  public double locationDistance(String street);

  public double calculateTripDistance(String passengerLocation, String deliveryAddress);
}
