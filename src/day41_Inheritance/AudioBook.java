package day41_Inheritance;

public class AudioBook extends  Books{
     /*
    title
    author
    price

    length
    narrator
    listen()
    toString()
     */

     public  String length;

     public void listen(){
         System.out.println("Listening to "+title);
     }

}
