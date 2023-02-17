package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.LiskovSubstitutionPrinciple.good;

public class FreeMember implements TournamentJoiner {
    private final String name;

    public FreeMember(String name) {
        this.name = name;
    }

    @Override
    public void joinTournament() {
        System.out.println("Free member joins tournament ...");
    }
}
