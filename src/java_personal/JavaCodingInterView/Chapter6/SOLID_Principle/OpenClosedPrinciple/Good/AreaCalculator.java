package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.OpenClosedPrinciple.Good;

import java.util.List;

public class AreaCalculator {
    private final List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        int sum = 0;

        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}
