package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.OpenClosedPrinciple.Good;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
