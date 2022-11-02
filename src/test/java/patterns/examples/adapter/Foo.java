package patterns.examples.adapter;

import java.util.Scanner;

public class Foo {
	private final Scanner scanner;

	public Foo(Scanner scanner) {
		this.scanner = scanner;
	}

	public void doSomething(){
		int i = scanner.nextInt();
	}
}
