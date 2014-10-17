package exercise;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class CustomerTest {

    @Test
    public void shouldCharge3DollarsForANewRelease(){
        Customer customer = new Customer("Bill");
        Rental rental = mock(Rental.class);

        customer.addRental(rental);

        assertThat(customer.statement(), containsString("Amount owed is 3"));
    }
}