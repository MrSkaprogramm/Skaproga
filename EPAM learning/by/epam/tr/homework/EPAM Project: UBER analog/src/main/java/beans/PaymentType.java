import java.util.List;

public class PaymentType {
	private String paymentType;
	private boolean hasPromocode;
	private List<CreditCard> creditCards;
	private List<Promocode> promocodes;
	
	public PaymentType() {}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public boolean isHasPromocode() {
		return hasPromocode;
	}

	public void setHasPromocode(boolean hasPromocode) {
		this.hasPromocode = hasPromocode;
	}

	public List<CreditCard> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}

	public List<Promocode> getPromocodes() {
		return promocodes;
	}

	public void setPromocodes(List<Promocode> promocodes) {
		this.promocodes = promocodes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creditCards == null) ? 0 : creditCards.hashCode());
		result = prime * result + (hasPromocode ? 1231 : 1237);
		result = prime * result + ((paymentType == null) ? 0 : paymentType.hashCode());
		result = prime * result + ((promocodes == null) ? 0 : promocodes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentType other = (PaymentType) obj;
		if (creditCards == null) {
			if (other.creditCards != null)
				return false;
		} else if (!creditCards.equals(other.creditCards))
			return false;
		if (hasPromocode != other.hasPromocode)
			return false;
		if (paymentType == null) {
			if (other.paymentType != null)
				return false;
		} else if (!paymentType.equals(other.paymentType))
			return false;
		if (promocodes == null) {
			if (other.promocodes != null)
				return false;
		} else if (!promocodes.equals(other.promocodes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentType [paymentType=" + paymentType + ", hasPromocode=" + hasPromocode + ", creditCards="
				+ creditCards + ", promocodes=" + promocodes + "]";
	}
}
