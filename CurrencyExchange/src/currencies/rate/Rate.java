package currencies.rate;

import java.util.GregorianCalendar;

public class Rate {
	
	private GregorianCalendar date;
	private double sales;
	private double medium;
	private double purchasable;
	
	public GregorianCalendar getDate() {
		return date;
	}
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public double getMedium() {
		return medium;
	}
	public void setMedium(double medium) {
		this.medium = medium;
	}
	public double getPurchasable() {
		return purchasable;
	}
	public void setPurchasable(double purchasable) {
		this.purchasable = purchasable;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
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
		Rate other = (Rate) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rate [Date=" + date + ", Sales=" + sales + ", Medium=" + medium + ", Purchasable=" + purchasable + "]";
	}
	
	
	
}
