package orderProcessing

class Order {
    def items = []
    def quantities = []
    def prices = []
    String status = "open"

    def add_item(def name, def quantity, def price) {
        items << name
        quantities << quantity
        prices << price
    }

    def total_price() {
        def total = 0
        for (i in 0..prices.size() - 1) {
            total += quantities[i] * prices[i]
        }
        return total
    }
}