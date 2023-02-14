package java_personal.FastCampus.chapter5.coffee;

public class Person {

    int money;
    String name;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeCoffee(BackCoffee bCoffee, int money) {
        String message = bCoffee.brewing(money);
        if(message != null) {
            this.money -= money;
            System.out.println(name + "님 구매 가격은 "+ money + "원입니다. 그리고 " + message);
        }
    }

    public void showInfo() {
        System.out.println(name + "님이 주문하고 남은 돈은 " + money + "원 입니다.");
    }
}
