package patterns.examples.static_factory_method;

public class Main {

    public static void main(String[] args) {

        Shape square = Shape.squareWithLength(4);
        square.report();

        Shape circle = Shape.circleWithRadius(4);
        circle.report();

        Shape triangle = Shape.rightTriangleWithLengthAndHeight(4, 6);
        triangle.report();
    }
}
