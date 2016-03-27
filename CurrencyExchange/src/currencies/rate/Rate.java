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
		if(date==null)
			throw new NullPointerException("Error in typing date!");
		this.date = date;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		if(sales>0)
			this.sales = sales;
		else
			throw new IllegalArgumentException("Sales is 0 or negative number!");
	}
	public double getMedium() {
		return medium;
	}
	public void setMedium(double medium) {
		if(medium>0)
			this.medium = medium;
		else
			throw new IllegalArgumentException("Medium is 0 or negative number!");
	}
	public double getPurchasable() {
		return purchasable;
	}
	public void setPurchasable(double purchasable) {
		if(purchasable>0)
			this.purchasable = purchasable;
		else
			throw new IllegalArgumentException("Purchasable is 0 or negative number!");
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
