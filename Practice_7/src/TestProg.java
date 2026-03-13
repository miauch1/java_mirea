import java.util.ArrayList;
import java.util.List;

public class TestProg {
    public static void main(String[] args) {

        List<GeometricObject> arr = new ArrayList<GeometricObject>();

        try {
            Triangle first = new Triangle(2, 3, 4);
            arr.add(first);
        } catch (IllegalTriangleException e) {
            System.out.println("Error -> " + e.getMessage());
        }

        arr.add(new Circle(3));
        arr.add(new Rectangle(2, 3));
        arr.add(new Square(3));
        arr.add(new Circle(2.5));

        for (GeometricObject obj : arr) {
            System.out.println("Площадь -> " + obj.getArea());
            if (obj instanceof Square) {
                ((Square) obj).howToColor();
            }
            System.out.println();
        }
    }
}
