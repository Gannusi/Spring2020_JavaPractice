package day41_Inheritance;

public class EBook  extends Books{
     /*
    title
    author
    price
    size
    pages
    readbook
     */
     public  String size;
     public int pages;


    public void readbook(){
        System.out.println("reading "+title);
    }

}
