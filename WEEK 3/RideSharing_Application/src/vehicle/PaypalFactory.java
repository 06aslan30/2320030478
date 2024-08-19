package vehicle;

public class PaypalFactory implements PaymentFactory {

	@Override
	public Payment createPaymentMethod() {
		  return new Paypal();
	}

}
