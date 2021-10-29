package orderProcessing

class NotARobot extends Authorizer {
    private boolean authorized = false

    def not_a_robot() {
        println("Are you a robot? Naaaa...")
        authorized = true
    }

    def is_authorized() {
        return this.authorized
    }
}
