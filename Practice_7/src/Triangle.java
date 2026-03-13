public class Triangle extends GeometricObject {
    double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    // Constructors
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 > side3 || side1 + side3 > side2 || side3 + side2 > side1) {
            throw new IllegalTriangleException("This triangle doesn't exist!");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // get
    double getSide1() { return side1; }
    double getSide2() { return side2; }
    double getSide3() { return side3; }

    // other
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2 + " сторона3 = " + side3;
    }
}

