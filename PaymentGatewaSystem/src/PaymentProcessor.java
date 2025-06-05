
public interface PaymentProcessor {

	void processPayment(double amount);

	default void sendReceipt(String email) {
		System.out.println("Seding receipt to: " + email);
	}

}
