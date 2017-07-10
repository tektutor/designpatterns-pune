public class Adaptor implements CurrencyConverter {
	private double exchangeCharges = 100;

	private double getExchangeRateForUSD() {
		return 64.50;
	}


	public double pay ( double amountInUSD ) {

		double amountPayable = amountInUSD * getExchangeRateForUSD() ;
		amountPayable = amountPayable + exchangeCharges;
		return amountPayable;

	}

}
