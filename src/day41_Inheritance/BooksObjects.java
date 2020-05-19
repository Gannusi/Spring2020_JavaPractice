package day41_Inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class BooksObjects {

    public static void main(String[] args) {
         EBook book1 = new EBook();

         book1.title="Hamlet";
         book1.author="Shakspeare";
         book1.price =20;
         book1.pages =432;


         book1.size="1.5GB";
        System.out.println(book1);
        System.out.println("Size: "+ book1.size);
        System.out.println("Pages: "+book1.pages);

        book1.readbook();

        System.out.println("=======================================");

        AudioBook book2 = new AudioBook();
        book2.title="Little prince";
        book2.author="Antoine De Saint-exupéry";
        book2.price =30;
        book2.length="3 hours and 5 minutes";
        System.out.println(book2);
        System.out.println("Length of the audioBook: \""+book2.title+"\" is "+book2.length);

        book2.listen();

    }
}
