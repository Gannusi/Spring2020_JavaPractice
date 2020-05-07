package day34_CustomClass;

import java.time.format.TextStyle;

public class CapitalOne {

    public static void main(String[] args) {


        Testers tester1 =new Testers();
        tester1.setTesterInfo("Muhtar", 1234, "Manual Tester", 80000.00);


        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(tester1);

        System.out.println(scrum.testersTeam.size());

        scrum.fireTesrer(1234);

        System.out.println(scrum.testersTeam.size());



    }
}
