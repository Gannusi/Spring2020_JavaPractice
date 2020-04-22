package day14_StringClass;

import sun.tools.tree.NotEqualExpression;

import java.util.Scanner;

public class CheckWords {

/*
Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
 */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Enter three words");
        String word1 = s.next();
        String word2 = s.next();
        String word3 = s.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        boolean allNotEqual = length1!= length2 && length2!=length3 &&length1 != length3;


        if ( length1 == length2 && length2 == length3){
            System.out.println("All words are same length");

        } else if(allNotEqual){
            System.out.println("All different length");

        }else{
            System.out.println("Not Same nor Different lengths");

        }








    }
}
