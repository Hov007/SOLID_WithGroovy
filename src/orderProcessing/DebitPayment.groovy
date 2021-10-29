package orderProcessing

class DebitPayment extends PaymentProcessor {
    String security_code;
    Authorizer authorizer

    DebitPayment(String security_code, Authorizer authorizer) {
        this.security_code = security_code
        this.authorizer = authorizer
    }

    @Override
    def pay(Order order) throws Exception{
        if (! authorizer.is_authorized()) {
            throw new Exception("Not authorised");
        }
        println("Processing debit payment type")
        println("Verifying security code: ${security_code}")
        order.status = "paid"
    }
}