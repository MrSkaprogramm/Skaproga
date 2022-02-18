public class Payment {
	private Rate rates;
	private int paymentSum;
	private PaymentType paymentType;
	
	public Payment() {}

	public Rate getRates() {
		return rates;
	}

	public void setRates(Rate rates) {
		this.rates = rates;
	}

	public int getPaymentSum() {
		return paymentSum;
	}

	public void setPaymentSum(int paymentSum) {
		this.paymentSum = paymentSum;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + paymentSum;
		result = prime * result + ((paymentType == null) ? 0 : paymentType.hashCode());
		result = prime * result + ((rates == null) ? 0 : rates.hashCode());
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
		Payment other = (Payment) obj;
		if (paymentSum != other.paymentSum)
			return false;
		if (paymentType == null) {
			if (other.paymentType != null)
				return false;
		} else if (!paymentType.equals(other.paymentType))
			return false;
		if (rates != other.rates)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [rates=" + rates + ", paymentSum=" + paymentSum + ", paymentType=" + paymentType + "]";
	}
}
