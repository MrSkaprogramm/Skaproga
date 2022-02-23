import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment implements Serializable{
  /**
  * 
  */
  private static final long serialVersionUID = -5728209432672649984L;
  private double paymentSum;
    private CreditCard creditCard;
    private List<Promocode> promocodes;

    public Payment() {
      this.creditCard = null;
      this.promocodes = new ArrayList<>();
    }

    public double getPaymentSum() {
      return paymentSum;
    }

    public void setPaymentSum(double paymentSum) {
      this.paymentSum = paymentSum;
    }

    public CreditCard getCreditCard() {
      return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
      this.creditCard = creditCard;
    }

    public List<Promocode> getPromocodes() {
      return promocodes;
    }

    public void setPromocodes(List<Promocode> promocodes) {
      this.promocodes = promocodes;
    }

    @Override
    public int hashCode() {
      return Objects.hash(creditCard, paymentSum, promocodes);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Payment other = (Payment) obj;
      return Objects.equals(creditCard, other.creditCard)
          && Double.doubleToLongBits(paymentSum) == Double.doubleToLongBits(other.paymentSum)
          && Objects.equals(promocodes, other.promocodes);
    }

    @Override
    public String toString() {
      return "Payment [paymentSum=" + paymentSum + ", creditCard=" + creditCard + ", promocodes="
          + promocodes + "]";
    }
}
