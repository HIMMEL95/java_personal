package java_personal.JavaCodingInterView.Chapter6.OOP_Programming_Concepts.Association;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Andrei");
        Person p2 = new Person("Marin");
        Address a1 = new Address("Banesti", "107050");
        Address a2 = new Address("Bucuresto", "229344");

        System.out.println(p1.getName() + " lives at address " + a2.getCity() + ", " + a2.getZip() + " but it also has an address at " + a1.getCity() + ", " + a1.getZip());
        System.out.println(p2.getName() + " lives at address " + a1.getCity() + ", " + a1.getZip() + " but it also has an address at " + a2.getCity() + ", " + a2.getZip());
    }
}
