package exercise;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CustomerTest {

	@Test
	public void shouldCharge3DollarsForANewRelease() {
		Customer customer = new Customer("Bill");
		Rental rental = mock(Rental.class);
		when(rental.daysRented()).thenReturn(1);
		Tape tape = mock(Tape.class);
		when(rental.tape()).thenReturn(tape);
		Movie movie = mock(Movie.class);
		when(tape.movie()).thenReturn(movie);
		when(movie.priceCode()).thenReturn(Movie.NEW_RELEASE);

		customer.addRental(rental);

		assertThat(customer.statement()).contains("Amount owed is 3");
	}
}