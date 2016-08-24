package patterns.examples.builder;

public class CustomerBuilder {
    private String customerId;

    public CustomerBuilder withId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public Customer build() {
        return new Customer(customerId);
    }
}
