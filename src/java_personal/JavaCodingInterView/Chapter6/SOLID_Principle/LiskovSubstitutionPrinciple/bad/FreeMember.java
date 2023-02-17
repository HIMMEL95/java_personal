package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.LiskovSubstitutionPrinciple.bad;

public class FreeMember extends Member{
    public FreeMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("Classic member joins tournament ...");
    }

    @Override
    public void organizeTournament() {
        System.out.println("A free member cannot organize tournaments");
    }
}
