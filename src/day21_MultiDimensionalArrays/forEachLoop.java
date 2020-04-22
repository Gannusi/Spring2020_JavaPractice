package day21_MultiDimensionalArrays;

public class forEachLoop {
/*
for(DataType variableName: ArrayName) {
}
DataType MUST be mach
 */
    public static void main(String[] args) {

        int [] nums={1, 2, 3, 4};

        for(int eachElement: nums){
            System.out.println(eachElement);

        }
        String[] students ={"Muhtar", "Hanna", "Asiya"};
        for(String eachStudent: students){
            System.out.print(eachStudent+" ");
        }
        System.out.println();
        System.out.println("============================" );


//print from 5---> 10

        int[] arr1= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int eachNum: arr1){
           if(eachNum<5){
               continue;

           }
            System.out.println(eachNum);
        }

        System.out.println("==================================");
        // revers , use for each loop
        String sentence = "I like Java";

        String[]  words = sentence.split(" "); // [ I, like, Java]

        for (String eachWord: words){ // 0 ~2
            System.out.println(eachWord);
        }
        System.out.println("=====================================");

        for(int i = words.length-1; i>=0; i--){
            System.out.println(words[i]);


        }
        System.out.println("=========================================");






    }
}
