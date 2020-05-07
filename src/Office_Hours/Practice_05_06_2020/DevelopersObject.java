package Office_Hours.Practice_05_06_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {
    public static void main(String[] args) {


    Developer dev1 = new Developer();

    dev1.setInfo("Leanardo", "Senior Developer", 160_000,18121993);
        System.out.println( dev1 );
        dev1.Coding();

        Developer dev2= new Developer();
        dev2.setInfo("Leon","Senior Developer",180000,12546);

        dev2.Coding();
        dev2.Fix();
        System.out.println("============================================");


        Developer[] arr1= {dev1, dev2};

        /*
        for (int i =0; i < arr1.length; i++){

            System.out.println( arr1[i]);
        }
         */

        for( Developer each: arr1){
            System.out.println(each);

        }

        System.out.println("============================================");

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(arr1));

        //developers.addAll(Arrays.asList(dev1, dev2));
       /* for(int i= 0; i < developers.size(); i++){
            System.out.println( developers.get(i).name);
        }
        */

       for(Developer each: developers){
           System.out.println( each.name+" "+ each.salary);
       }





    }
}

