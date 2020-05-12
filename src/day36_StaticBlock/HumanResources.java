package day36_StaticBlock;

import Office_Hours.Practice_05_06_2020.Developer;

public class HumanResources {

    static Developer dev1= new Developer();
    static Developer dev2= new Developer();
    static Developer dev3= new Developer();
    static Developer dev4= new Developer();
    static  Developer dev5= new Developer();

   static {
        dev1.setInfo("Ryba", "Developer", 120000.0, 1111);
    }


}
