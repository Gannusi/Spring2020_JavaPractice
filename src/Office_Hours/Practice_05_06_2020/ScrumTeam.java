package Office_Hours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testerTeam = new ArrayList<>();
    ArrayList<Developer> devpTeam = new ArrayList<>();
    public  void hireATester ( Tester tester){
        testerTeam.add(tester);
    }

    public  void  fireATester( long id){
        testerTeam.removeIf(p -> p.employeeId== id);

    }
    public void hireADeveloper(Developer developer){
        devpTeam.add( developer );
    }

    public void fireADeveloper(long id){
        devpTeam.removeIf(  eachDev -> eachDev.employeeId == id );
    }




}
