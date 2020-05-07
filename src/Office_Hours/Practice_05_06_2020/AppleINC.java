package Office_Hours.Practice_05_06_2020;

public class AppleINC {

    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setInfo("LALA","Junior bebe", 200000.00, 12340912);

        Tester tester2 = new Tester();
        tester2.setInfo("Lama","Junior kisa", 150000.00, 12398772);

        Tester tester3 = new Tester();
        tester3.setInfo("Laska","Junior mamichka", 300000.00, 1238712);

        ScrumTeam scrum1= new ScrumTeam();
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        // scrum1.testersTeam // returns the testersTeam arrayList form scrum1
        for( Tester each   : scrum1.testerTeam){
            System.out.println(each);
        }
        System.out.println("=====================================");

        Developer dev1 = new Developer();
        dev1.setInfo("Barzy","Senior Developer",120200,1122337);

        Developer dev2 = new Developer();
        dev2.setInfo("Emrah", "Usta Developer", 100000,223232);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);


        // scrum1.fireADeveloper(1122337);

        System.out.println(scrum1.devpTeam.size() );

        for(Developer each : scrum1.devpTeam){ // arraylist of developer in scrum team
            System.out.println(each);
        }

        System.out.println("====================================================");

        System.out.println("In my scrum team, We have "+scrum1.testerTeam.size()
                +" testers and "+scrum1.devpTeam.size()+" developers");





    }
}
