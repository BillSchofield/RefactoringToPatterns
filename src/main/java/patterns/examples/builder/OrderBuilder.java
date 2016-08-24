package patterns.examples.builder;

public class OrderBuilder {

    private String number;
    private String customerId;

    public OrderBuilder() {
        number = "1";
        customerId = "1";
    }

    public OrderBuilder withNumber(String number){
        this.number = number;
        return this;
    }

    public OrderBuilder withCustomerId(String customerId){
        this.customerId = customerId;
        return this;
    }

    public Order build(){
        Customer customer = new CustomerBuilder().withId(customerId).build();
        return new Order(number, customer);
    }
}