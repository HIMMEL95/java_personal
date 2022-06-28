package java_personal.FastCampus.chapter5.coffee;

public class CoffeeTest {

    public static void main(String[] args) {
        Person Kim = new Person("Kim", 10000);
        Person Lee = new Person("Lee", 20000);

        BackCoffee backCoffee = new BackCoffee();

        Kim.takeCoffee(backCoffee, Menu.AMERICANO);
        Lee.takeCoffee(backCoffee, Menu.ADE);
        
    }
}
