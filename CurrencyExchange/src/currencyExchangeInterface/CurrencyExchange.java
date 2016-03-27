package currencyExchangeInterface;

import java.util.GregorianCalendar;

import currencies.Currency;
import currencies.rate.Rate;

public class CurrencyExchange implements currencyInterface {

	@Override
	public void addNewRate(Currency currency, GregorianCalendar date, double s, double m, double p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRate(Currency currency, GregorianCalendar date) {
		// TODO Auto-generated method stub

	}

	@Override
	public Rate restoreRate(Currency currency, GregorianCalendar date) {
		
		return null;
		
	}

}
