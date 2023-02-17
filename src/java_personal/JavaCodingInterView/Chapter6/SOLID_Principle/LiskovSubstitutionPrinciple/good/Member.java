package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.LiskovSubstitutionPrinciple.good;

public abstract class Member implements TournamentJoiner, TournamentOrganizer {
    private final String name;

    public Member(String name) {
        this.name = name;
    }
}
