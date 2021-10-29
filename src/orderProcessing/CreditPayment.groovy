package orderProcessing

class CreditPayment extends PaymentProcessor {
    String security_code;

    CreditPayment(String security_code) {
        this.security_code = security_code
    }

    @Override
    def pay(Order order) {
        println("Processing credit payment type")
        println("Verifying security code: ${security_code}")
        order.status = "paid"
    }


}