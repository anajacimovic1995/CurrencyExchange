package currencyExchangeInterface;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import currencies.Currency;
import currencies.rate.Rate;

public class CurrencyExchange implements currencyInterface {


	private LinkedList<Rate> rates;
	
	public CurrencyExchange(LinkedList<Rate> rates) {
		this.rates=rates;

	}
	
	@Override
	public void addNewRate(Currency currency, GregorianCalendar date, double s, double m, double p) {
		
		Rate r = new Rate();
		r.setDate(date);
		r.setMedium(m);
		r.setPurchasable(p);
		r.setSales(s);
		

		if(rates.contains(r))
			throw new RuntimeException("It is already exist!");

		rates.add(r);
	}

	@Override
	public void deleteRate(Currency currency, GregorianCalendar date) {
		for(int i=0; i<rates.size(); i++){
			if(rates.get(i).getDate().equals(date)){
				rates.remove(i);
			}
		}

	}

	@Override
	public Rate restoreRate(Currency currency, GregorianCalendar date) {
		for(int i=0; i<rates.size(); i++){
			if(rates.get(i).getDate().equals(date)){
				return rates.get(i);
			}
		}
		
		return null;
	}

}
