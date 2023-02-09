package java_personal.FastCampus.chapter5.coffee;

public class BackCoffee {

    int money;

    public String brewing(int money) {
        this.money += money;

        if (money == Menu.ADE) 
            return "백 커피 에이드를 구매하셨습니다.";
        else  if (money  == Menu.AMERICANO)
            return "백 커피 아메리카노를 구매하셨습니다.";
        else  if (money  == Menu.CANDYSODA)
            return "백 커피 캔디소다를 구매하셨습니다.";
        else  if (money == Menu.SMOOTHIE)
            return "백 커피 스무디를 구매하셨습니다.";
        else 
            return null;
    }
}
