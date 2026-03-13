package ex1;

public class Circle implements Comparable<Circle> {
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    @Override
    public int compareTo(Circle obj) {
        return Integer.compare(this.radius, obj.getRadius());
    }
}
