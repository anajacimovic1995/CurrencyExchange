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
	
	
}
