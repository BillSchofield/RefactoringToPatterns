package patterns.examples.adapter;

import org.junit.jupiter.api.Test;

import java.util.Scanner;


class ScannerUseTest {
	@Test
	void shouldBeAbleToMockWhenTesting() {
		Scanner scanner = new Scanner(System.in);
		Foo foo = new Foo(scanner);

		foo.doSomething();
	}
}