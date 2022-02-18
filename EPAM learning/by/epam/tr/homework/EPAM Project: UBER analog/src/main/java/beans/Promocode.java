public class Promocode {
	private int promocodeNum;
	private int discount;
	
	public Promocode() {}

	public int getPromocodeNum() {
		return promocodeNum;
	}

	public void setPromocodeNum(int promocodeNum) {
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
		final int prime = 31;
		int result = 1;
		result = prime * result + discount;
		result = prime * result + promocodeNum;
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
		Promocode other = (Promocode) obj;
		if (discount != other.discount)
			return false;
		if (promocodeNum != other.promocodeNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Promocode [promocodeNum=" + promocodeNum + ", discount=" + discount + "]";
	}
}
