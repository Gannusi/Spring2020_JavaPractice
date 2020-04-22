package day09_NestedIf_Ternary;

public class ageGroups {


    /*
       baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
     */
    public static void main(String[] args) {


    byte age = 100;

    String group =" ";

    if(age<1){
        group = "infant";
    }else if(age>=3 && age<=5){
        group = "Toddler";
    }else if(age>=6 && age <=9){
        group = "Kid";
    }else if(age>=10 && age<=12){
        group = "Pre-Teen";
    }else if(age>=13 && age<=17){
        group = "Teenager";
    } else if (age >=18 && age <=20){
        group="Young Adult";
    } else if (age >=21 && age <=39){
        group="Adult";
    } else if (age >=40 && age <=49){
        group="Young Middle-Aged Adult";
    } else if (age >=50 && age <=54){
        group="Middle-Aged Adult";
    } else if (age >=55 && age <=64){
        group ="Very Young Senior Citizen";
    } else if (age >= 65 && age <=74){
        group="Young Senior Citizen";
    } else if (age >= 75 && age <=84){
        group="Senior Citizen";
    } else if (age>=85 && age<=120){
        group = "Old Senior Citizen";
    }else{
        group = "Invalid age";
    }
        System.out.println(group);


    boolean eligibleToBuy = group == "Adult" || group == "Young Middle-Aged Adult"||
            group=="Middle-Aged Adult";


    if(eligibleToBuy){
        System.out.println("You are eligible");
    }else {
        System.out.println("You are not eligible");
    }




}

}

