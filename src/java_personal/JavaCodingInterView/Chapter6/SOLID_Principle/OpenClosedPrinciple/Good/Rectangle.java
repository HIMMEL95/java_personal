package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.OpenClosedPrinciple.Good;

public class Rectangle implements Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
