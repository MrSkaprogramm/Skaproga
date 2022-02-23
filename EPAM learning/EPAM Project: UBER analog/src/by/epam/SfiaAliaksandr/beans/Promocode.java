import java.io.Serializable;
import java.util.Objects;

public class Promocode implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 3681718065019909653L;
  private String promocodeNum;
  private int discount;
	
  public Promocode(String promocodeNum, int discount) {
    this.promocodeNum = promocodeNum;
    this.discount = discount;
  }

  public String getPromocodeNum() {
    return promocodeNum;
  }

  public void setPromocodeNum(String promocodeNum) {
    this.promocodeNum = promocodeNum;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(discount, promocodeNum);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Promocode other = (Promocode) obj;
    return discount == other.discount && Objects.equals(promocodeNum, other.promocodeNum);
  }

  @Override
  public String toString() {
    return "Promocode [promocodeNum=" + promocodeNum + ", discount=" + discount + "]";
  }
}
