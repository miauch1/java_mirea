import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the 1 side of triangle: ");
            double a = scanner.nextDouble();

            System.out.print("Enter the 2 side of triangle: ");
            double b = scanner.nextDouble();

            System.out.print("Enter the 3 side of triangle: ");
            double c = scanner.nextDouble();

            System.out.print("Enter the color: ");
            String color = scanner.next();

            System.out.print("Enter is triangle feeling in: ");
            boolean feel = scanner.nextBoolean();

            Triangle triangle = new Triangle(a, b, c);
            triangle.setColor(color);
            triangle.setFilled(feel);

            System.out.println(triangle);
            System.out.println("Color: " + triangle.getColor() + "\nFeeling: " + triangle.isFilled());

        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
