
public class PayPalPayment implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing PayPal paymnt of $ " + amount);
	}

	@Override
	public void sendReceipt(String email) {
		System.out.println("PayPal-specific receipt sent to " + email);
	}
}
