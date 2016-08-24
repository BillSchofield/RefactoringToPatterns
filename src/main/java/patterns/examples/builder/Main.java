package patterns.examples.builder;

public class Main {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();
        Order order = orderBuilder
                .withCustomerId("Bill's Bread")
                .withNumber("1234")
                .build();
    }
}
