import beans.Order;

public interface PaymentService {
  public String transaction(Order order, String role);

  public boolean addCreditCard(int creditCardNum, String expiringDate);

  public boolean addPromocode(String promocodeNum, int discount);
}
