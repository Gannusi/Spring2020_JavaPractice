package Office_Hours.Practice_03_11_2020;

public class SingleIf_Practice2 {

    public static void main(String[] args) {

        byte age= 30;
        boolean eligibleToBuy = age> 21|| age==21;
        if(eligibleToBuy){
            System.out.println("Here is your Vodka");
        }
        if (!eligibleToBuy){
            System.out.println("Go drink your milk");
        }


        boolean feeling = false;
        if(feeling== false){
            System.out.println("don't be sad");
        }
        if(feeling == true){
            System.out.println("Stay happy");
        }



    }
}
