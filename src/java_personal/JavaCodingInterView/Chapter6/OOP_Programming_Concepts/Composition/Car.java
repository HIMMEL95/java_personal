package java_personal.JavaCodingInterView.Chapter6.OOP_Programming_Concepts.Composition;

public class Car {
    private final String name;
    private final Engine engine;

    public Car(String name) {
        this.name = name;

        Engine engine = new Engine("petrol", 300);
        this.engine = engine;
    }

    public int getHorsepower() {
        return engine.getHorsepower();
    }

    public String getName() {
        return name;
    }
}
