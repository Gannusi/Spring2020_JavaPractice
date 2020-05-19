package Office_Hours.homework.ReplIt;

import java.util.Scanner;

public class WhatBetweenBread {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        for(int i=0;i<str.length()-4; i++){
            if(str.substring(i,i+5).equalsIgnoreCase("bread")){
                count++;
            }
        }
        if(count==2){
            System.out.println(str.substring(str.indexOf("bread") + 5,
                    str.lastIndexOf("bread")));
        }else if(count<=1){
            System.out.println("nothing");
        }else if(count>2){
            str=str.replaceFirst("bread"," ");
            System.out.println(str.substring(str.indexOf("bread"),
                    str.lastIndexOf("bread")));
        }
    }
}
