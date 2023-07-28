package patterns.examples.adapter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;


class ScannerUseTest {
	@Test
	void shouldBeAbleToMockWhenTesting() {
		Scanner scanner = Mockito.mock(Scanner.class);
		Foo foo = new Foo(scanner);

		foo.doSomething();

	}
}