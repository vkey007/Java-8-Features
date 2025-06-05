
public class PaymentApp {

	public static void main(String[] args) {
		
		PaymentProcessor credit = new CreditCardPayment();
		credit.processPayment(234.78);
		
		
		PaymentProcessor payPal = new PayPalPayment();
		payPal.processPayment(100.00);
		payPal.sendReceipt("paypal@example.com");
	}
}
