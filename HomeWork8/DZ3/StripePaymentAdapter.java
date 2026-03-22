package DZ3;

class StripePaymentAdapter implements IPaymentProcessor {

    private StripePaymentService stripeService;

    public StripePaymentAdapter(StripePaymentService stripeService) {
        this.stripeService = stripeService;
    }

    public void processPayment(double amount) {
        stripeService.makeTransaction(amount);
    }
}
