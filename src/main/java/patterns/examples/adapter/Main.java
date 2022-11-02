package patterns.examples.adapter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.printf("%d + %d = %d", x, y, x + y);
        }

        {
            Reader reader = new Reader(System.in);
            int x = reader.readInteger();
            int y = reader.readInteger();

            System.out.printf("%d + %d = %d", x, y, x + y);
        }
    }
}
