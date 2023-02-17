package java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.LiskovSubstitutionPrinciple;

import java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.LiskovSubstitutionPrinciple.bad.FreeMember;
import java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.LiskovSubstitutionPrinciple.bad.Member;
import java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.LiskovSubstitutionPrinciple.bad.PremiumMember;
import java_personal.JavaCodingInterView.Chapter6.SOLID_Principle.LiskovSubstitutionPrinciple.bad.VipMember;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> members1 = List.of(
                new PremiumMember("Jack Hores"),
                new VipMember("Tom Johns"),
                new FreeMember("Martin Vilop")
        );

        for (Member member : members1)
            member.organizeTournament();
    }
}
