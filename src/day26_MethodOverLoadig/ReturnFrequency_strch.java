package day26_MethodOverLoadig;

public class ReturnFrequency_strch {

/*
1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
 */
    public static void main(String[] args) {

        String str = "AAA";
        char ch='A';

        int count = 0;

        char [] arr = str.toCharArray();// [A, A, A ]

        for ( char each  :arr){
            if(each==ch){
                count++;
            }

        }
        System.out.println( count);// 3 AAA

        //=====================================

        String str2= "AGAFAFFFFF";
        char ch2= 'F';
        int res = frequency(str2,ch2);
        System.out.print(res+" ");// 6 FFFFFF
    }


    public static  int frequency(String str, char ch){

        char [] arr = str.toCharArray();

        int count = 0;



        for ( char each  :arr) {
            if (each == ch) {
                count++;
            }
        }

      return count;
    }
}
