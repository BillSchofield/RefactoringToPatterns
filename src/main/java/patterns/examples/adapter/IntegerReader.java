package patterns.examples.adapter;

import java.io.InputStream;
import java.util.Scanner;

public class IntegerReader {
    private final Scanner scanner;

    public IntegerReader(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public int readInt() {
        return scanner.nextInt();
    }
}
