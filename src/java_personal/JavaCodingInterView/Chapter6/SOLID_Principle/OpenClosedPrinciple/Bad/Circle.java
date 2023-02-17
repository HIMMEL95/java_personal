package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.OpenClosedPrinciple.Bad;

public class Circle implements Shape {
   private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
