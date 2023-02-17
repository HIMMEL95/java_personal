package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.SingleResponsibilityPrinciple;

public class AreaConverter {
    private static final double INCH_TERM = 0.0254d;
    private static final double FEET_TERM = 0.3048d;

    public double metersToInches(int area) {
        return area / INCH_TERM;
    }

    public double metersToFeet(int area) {
        return area / FEET_TERM;
    }
}
