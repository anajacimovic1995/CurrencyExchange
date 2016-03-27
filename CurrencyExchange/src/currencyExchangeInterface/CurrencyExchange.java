package currencyExchangeInterface;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import currencies.Currency;

public class CurrencyExchange implements currencyInterface {
	
	private LinkedList<Currency> currencies;
	
	public CurrencyExchange(LinkedList<Currency> currencies) {
		this.currencies = currencies;
	}
	
	@Override
	public void addNewRate(Currency currency, GregorianCalendar date, double s, double m, double p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRate(Currency currency, GregorianCalendar date) {
		// TODO Auto-generated method stub

	}

	@Override
	public void restoreRate(Currency currency, GregorianCalendar date) {
		// TODO Auto-generated method stub

	}

}
