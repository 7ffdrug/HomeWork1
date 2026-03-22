package DZ3;

class PaymentTest {
    public static void main(String[] args) {

        IPaymentProcessor paypal = new PayPalPaymentProcessor();
        paypal.processPayment(100);

        IPaymentProcessor stripe = new StripePaymentAdapter(new StripePaymentService());
        stripe.processPayment(200);

        IPaymentProcessor crypto = new CryptoPaymentAdapter(new CryptoPaymentService());
        crypto.processPayment(300);
    }
}
