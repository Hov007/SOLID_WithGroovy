package orderProcessing

class PayPalPayment extends PaymentProcessor {
    String email_address;
    SMSAuth authorizer

    PayPalPayment(String email_address, SMSAuth authorizer) {
        this.email_address = email_address
        this.authorizer = authorizer
    }

    @Override
    def pay(Order order) throws Exception{
        if (! authorizer.is_authorized()) {
            throw new Exception("Not authorised")
        }
        println("Processing paypal  payment type")
        println("Verifying email address: ${email_address}")
        order.status = "paid"
    }
}


