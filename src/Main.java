public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Customer customer = new Customer("Alikhan");
        MenuItem coffee = new MenuItem("'Espresso' Coffee for 500ml", 2000);
        MenuItem tea = new MenuItem("'Black' Tea for 450ml", 800);
        MenuItem cake = new MenuItem("'Sunshine' Cake 400g", 1500);

        Order order = customer.createOrder();
        order.addItem(coffee);
        order.addItem(tea);
        order.addItem(cake);
        cafe.placeOrder(customer, order);
        System.out.println("order:");
        for (MenuItem item : order.getItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
        System.out.println("total cost: " + order.getTotalPrice());
    }
}