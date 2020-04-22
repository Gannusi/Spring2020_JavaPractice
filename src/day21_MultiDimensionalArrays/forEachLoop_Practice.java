package day21_MultiDimensionalArrays;

public class forEachLoop_Practice {
  /*
  DecimalFormat: used for rounding the decimals

            presented in "java.text"
            DecimalFormat  DF = new DecimalFormat("0.00");  // rounds to the second decimal
            DecimalFormat  DF = new DecimalFormat("0.000"); // rounds to the Third decimal
String methods:
        toCharArray(): returns char array from string, returns char array
        split(Value): splits the string with given value, returns String array
go to -> canvas -> java - > modules - > day21 -> pelase complete "Arrays short quiz"
        come back at 12:15
        please use chrome or firefox browsers


for each loop: loop that's already been iterated
        for(DataType variableName : ArrayName ){
        }
        variable name represents each of the data in the array
        DataType MUST be matched with Array's data type
        number of execution times of the loop depends on teh size of the Array
        iteration is always started from index 0 of the Array
        When do we use it:  first we MUST have a data structure
                            whenever we dont need to provide the index numbers
Tomorrow: for each loop
          Custom methods

   */
    public static void main(String[] args) {
        char[ ] leters = {'a','c', 'd','b'};

        for(char eachleter: leters){

            System.out.println(eachleter);
        }





    }
}
