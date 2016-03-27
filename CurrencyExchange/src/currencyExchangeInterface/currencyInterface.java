package currencyExchangeInterface;

import java.util.GregorianCalendar;

import currencies.Currency;
import currencies.rate.Rate;

public interface currencyInterface {
	
	public void addNewRate ( Currency currency , GregorianCalendar date , double s, double m, double p );
	public void deleteRate ( Currency currency , GregorianCalendar date );
	public Rate restoreRate ( Currency currency , GregorianCalendar date );
	
}
