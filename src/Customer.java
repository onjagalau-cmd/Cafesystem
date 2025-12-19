public class Customer {
    private String name;
    public Customer(String name) {
        this.name = name;
    }
    public Order createOrder() {
        return new Order();
    }
    public String getName() {
        return name;
    }
}