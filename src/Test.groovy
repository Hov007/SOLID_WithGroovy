import orderProcessing.DebitPayment
import orderProcessing.NotARobot
import orderProcessing.Order
import orderProcessing.PayPalPayment
import orderProcessing.SMSAuth

class Test {
    static void main(String[] args) {
        def order = new Order()
        order.add_item("Keyboard", 1, 50)
        order.add_item("SSD", 1, 150)
        order.add_item("USB cable", 2, 5)
        println(order.total_price())
        def authorizer = new NotARobot()
        def processor = new DebitPayment("2349875", authorizer)
        authorizer.not_a_robot()
        processor.pay(order)
    }
}
