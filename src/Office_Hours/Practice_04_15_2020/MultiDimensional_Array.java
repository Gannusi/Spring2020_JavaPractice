package Office_Hours.Practice_04_15_2020;

import java.util.Arrays;

public class MultiDimensional_Array {


    public static void main(String[] args) {


        int [ ] arr1D ={1, 2, 3};

        int [] [] arr2D ={{1, 2, 3}, {4, 5, 6, 7}};


        System.out.println(arr2D[1]);// not right
        System.out.println(Arrays.toString(arr2D[1]));


        // 7
        System.out.println( arr2D[1][3]  );

        // 4
        System.out.println( arr2D[1][0]  );





    }
}
