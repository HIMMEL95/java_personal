package java_personal.JavaCodingInterView.Chapter6.OOP_Programming_Concepts.Polymorphism.Overriding;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a rectangle ...");
    }
}
