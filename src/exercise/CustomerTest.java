package exercise;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class CustomerTest {

    @Test
    public void shouldCharge2DollarsForARegularRental(){
        Customer customer = new Customer("Bill");
        Rental mock = mock(Rental.class);
        customer.addRental(mock);

        assertThat(customer.statement(), containsString("Amount owed is 2"));
    }
}