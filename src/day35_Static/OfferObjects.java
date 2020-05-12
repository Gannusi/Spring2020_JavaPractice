package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {


    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.setInfo("NYC", "Apple", 200000.00, true);


        Offer offer2 = new Offer();
        offer2.setInfo("LA", "Google", 90000.00, false);


        Offer offer3 = new Offer();
        offer3.setInfo("NYC", "Gucci", 250000.00, true);


        Offer offer4 = new Offer();
        offer4.setInfo("Paris", "YSL", 150000.00, false);


        Offer[] offers = {offer1, offer2, offer3, offer4};

        String myLocation = "NYC";

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));

        System.out.println( Accept.size());

        Accept.removeIf(p -> p.salary < 100000 && !p.isFullTime || !p.location.equals(myLocation));
        for( Offer each : Accept){
            System.out.println( each);

        }









    }
}
