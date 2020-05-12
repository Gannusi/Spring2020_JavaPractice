package day36_StaticBlock;

import day34_CustomClass.Testers;

public class StaticBlock2 {

    static  int a;
    static  int b;


    static Testers tester1 =new Testers();

    public static void main(String[] args) {
        tester1.setTesterInfo("Hanna", 1234,"Actreese", 10000000.0);
        System.out.println(tester1);

    }
    static {
        a=100;
        b=200;
        if (100>200){
            a=100;
        }else{
            b=200;

        }

        tester1.setTesterInfo("Hanna", 1234,"Actreese", 10000000.0);

    }
}
