package java_personal.JavaCodingInterView.Chapter6.OOP_Programming_Concepts.Aggregation;

public class Main {
    public static void main(String[] args) {
        Racket racket = new Racket("Babolat Pure Aero", 100, 300);
        TennisPlayer player = new TennisPlayer("Rafael Nadal", racket);

        System.out.println("Player " + player.getName() + " plays with " + player.getRacket().getType());
    }
}
