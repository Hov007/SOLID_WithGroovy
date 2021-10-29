package orderProcessing

class SMSAuth extends Authorizer {
    private boolean authorized = false

     def verify_code(code) {
         println("Verifying code ${code}")
         authorized = true
     }

    def is_authorized() {
        return this.authorized
    }
}
