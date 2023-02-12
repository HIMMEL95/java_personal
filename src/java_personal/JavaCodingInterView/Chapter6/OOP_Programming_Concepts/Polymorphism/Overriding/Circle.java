package java_personal.JavaCodingInterView.Chapter6.OOP_Programming_Concepts.Polymorphism.Overriding;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a circle ...");
    }
}
