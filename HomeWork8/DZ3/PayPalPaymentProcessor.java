package DZ3;

class PayPalPaymentProcessor implements IPaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal");
    }
}
