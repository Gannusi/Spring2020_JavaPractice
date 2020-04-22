package day21_MultiDimensionalArrays;

public class ScrumTeam {

    public static void main(String[] args) {

        String[] DevTeam = {"Hanna", "Muhtar", "Asia","Reem"};
        String[] TestTeam ={"Rahman", "Aishan", "Osman","Ali"};
        String [] PO= {"Donald", "Anna"};
        String [] TestersTeam2= {"Vasl", "Giva", "Zarina", "Anastasia"};



       String[][] ScrumTeam = {DevTeam, TestTeam, PO};
                      //           0        1     2


        ScrumTeam[0][2]= "Jean";

        ScrumTeam[1]=TestersTeam2;

        System.out.println(ScrumTeam[0][2]);
        String  info = ScrumTeam[1][2];

        System.out.println(info);

        System.out.println("========================================");


        for( String eachEmployee: ScrumTeam[2]){

            System.out.println(eachEmployee);

        }
        System.out.println("=========================================");


        System.out.println(ScrumTeam[2][1]);



    }
}
