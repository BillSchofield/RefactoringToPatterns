package replace_constructors_with_creation_methods.static_factory_method;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Shape {
    private final double area;
    private final double circumference;

    private Shape(double area, double circumference) {
        this.area = area;
        this.circumference = circumference;
    }

    public static Shape squareWithLength(double length) {
        double area = length * length;
        double circumference = 4 * length;
        return new Shape(area, circumference);
    }

    public static Shape circleWithRadius(double radius) {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        return new Shape(area, circumference);
    }

    public static Shape rightTriangleWithLengthAndHeight(double length, double height) {
        double area = length * height / 2;
        double circumference = length + height + sqrt(square(length) + square(height));
        return new Shape(area, circumference);
    }

    private static double square(double number) {
        return number * number;
    }

    public void report() {
        System.out.println("Area <" + area +"> Circumference <" + circumference + ">");
    }
}
