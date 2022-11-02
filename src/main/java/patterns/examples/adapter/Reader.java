package patterns.examples.adapter;

import java.io.InputStream;
import java.util.Scanner;

public class Reader {
    private final Scanner scanner;

    public Reader(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public int readInteger() {
        return scanner.nextInt();
    }
}
