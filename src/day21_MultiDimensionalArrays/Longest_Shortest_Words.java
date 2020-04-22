package day21_MultiDimensionalArrays;

public class Longest_Shortest_Words {


    public static void main(String[] args){


        String[] names = {"Hanna", "Reem", "Ana", "Ii", "Muhtar", "Omer", "Anastasia"};

        int maxLenghtString = names[0].length();
        int minLenghtString=names[0].length();



        String longestWord="";// or names[0]
        String shortestWors = names[0];


        for(int i=1;i<=names.length-1; i++){



            if(names[i].length()>maxLenghtString){
                maxLenghtString=names[i].length();
                longestWord=names[i];

            }

            if(names[i].length()<minLenghtString){

                minLenghtString= names[i].length();
                shortestWors=names[i];



            }
        }
        System.out.println(longestWord);
        System.out.println(shortestWors);








    }
}
