package java_personal.JavaCodingInterView.Chapter6.Inheritance;

public class Main {

    public static void main(String[] args) {
        Programmer p = new Programmer("Jona Nimar", "Toronto");

        String name = p.getName();
        String team = p.getTeam();

        System.out.println(name + " is assigned to the " + team + " team");
    }
}
