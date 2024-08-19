package vehicle;

public class CreditCardFactory implements PaymentFactory {

	@Override
	public Payment createPaymentMethod() {
		 return new CreditCard();
	}

}
