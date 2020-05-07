package day34_CustomClass;

import Office_Hours.Practice_04_29_2020.Arraylist_Methods;
import day25_MethodsRecap.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class T_BankOfAmerica {
    public static void main(String[] args) {


    Testers tester1= new Testers();
    tester1.setTesterInfo("Daenerys Targaryen", 61798789, "Mother of Dragons", 200000.00);

    System.out.println(tester1);


   Testers tester2 =new Testers();
   tester2.setTesterInfo("Madina", 1112233445,"QA", 200000.00);


        Testers tester3 =new Testers();
        tester3.setTesterInfo("Hanna", 1112287645,"BA", 800000.00);

        Testers tester4 =new Testers();
        tester4.setTesterInfo("Bodegita", 111888888,"SDET", 100000.00);


        Testers tester5 =new Testers();
        tester5.setTesterInfo("Jonny", 1118899999,"Dep", 1000000000000000.00);

        ArrayList<Testers> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3, tester4, tester5) );

        testers.removeIf( p -> !p.jobTitle.contains("SDET") );


        double totalBudget = 0;
        for( Testers each :  testers){
            System.out.println(each);
            totalBudget += each.salary;
        }

        System.out.println(totalBudget);




    }
}