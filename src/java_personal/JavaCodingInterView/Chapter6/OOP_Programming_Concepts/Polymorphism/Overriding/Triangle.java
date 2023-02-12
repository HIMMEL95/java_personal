package java_personal.JavaCodingInterView.Chapter6.OOP_Programming_Concepts.Polymorphism.Overriding;

public class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw a triangle ...");
    }
}
