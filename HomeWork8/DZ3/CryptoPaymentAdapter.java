package DZ3;

class CryptoPaymentAdapter implements IPaymentProcessor {

    private CryptoPaymentService cryptoService;

    public CryptoPaymentAdapter(CryptoPaymentService cryptoService) {
        this.cryptoService = cryptoService;
    }

    public void processPayment(double amount) {
        cryptoService.sendCrypto(amount);
    }
}
