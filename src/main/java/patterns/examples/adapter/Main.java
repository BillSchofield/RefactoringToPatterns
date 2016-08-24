package patterns.examples.adapter;

public class Main {

    public static void main(String[] args) {
        IntegerReader integerReader = new IntegerReader(System.in);
        int x = integerReader.readInt();
        int y = integerReader.readInt();

        System.out.printf("%d + %d = %d", x, y, x + y);

    }
}
