import java.io.Serializable;
import beans.CreditCard;
import beans.Order;
import beans.Payment;
import beans.Promocode;
import dao.DAOProvider;
import dao.PassengerDAO;
import service.PaymentService;

public class PaymentServiceImpl implements PaymentService, Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = -8575647077422797806L;
  private final DAOProvider provider = DAOProvider.getInstance();
  private PassengerDAO passengerDAO = provider.getPassengerDAO();
  Payment payment = new Payment();

  @Override
  public String transaction(Order order, String role) {
    System.out.println(order.getDriver().getCar().getRate().getTripRate());
    double tripPayment =
        order.getTotalDistance() * order.getDriver().getCar().getRate().getTripRate();
    double timePayment =
        order.getTotalTime() * order.getDriver().getCar().getRate().getTripTimeRate();
    double waitingTimePayment =
        order.getTotalWaitingTime() * order.getDriver().getCar().getRate().getWaitingRate();
    double paymentSum = tripPayment + timePayment + waitingTimePayment;
    order.getPayment().setPaymentSum(paymentSum);

    if (role.equalsIgnoreCase("passenger")) {
      if (order.getPassenger().getPaymentType().equalsIgnoreCase("creditcard")) {
        return "You paid for the trip " + paymentSum + "$ by bank card";
      } else {
        return "You paid for the trip " + paymentSum + "$ in cash";
      }
    } else {
      return "You have earned for the trip " + paymentSum + "$ to your account";
    }
  }

  @Override
  public boolean addCreditCard(int creditCardNum, String expiringDate) {
    passengerDAO.getPassengers().iterator().next().getPayment().setCreditCard(new CreditCard(creditCardNum, expiringDate));
    return true;
  }

  @Override
  public boolean addPromocode(String promocodeNum, int discount) {
    passengerDAO.getPassengers().iterator().next().getPayment().getPromocodes()
        .add(new Promocode(promocodeNum, discount));
    return true;
  }
}
