package day38_Constructors;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class dog {

    String name;
    String breed;
    int age;

    public dog() {
        name ="unknown";
        breed="unknown";
        age=0;

    }
   public  dog(String breed){
        this.breed= breed;
        name= "unknown";
        age =0;

   }
    public  dog(String breed, int age) {
        this.breed = breed;
      name = "unknown";
       this.age = age ;
    }
    public  String toString(){
        return  "Name: "+name+", breed: "+breed+", age: "+age;

    }

    }


   class  dogObject{

        public static void main(String[] args) {

            dog d1 =new dog();
            System.out.println(d1.name);
            System.out.println(d1.age);
            System.out.println(d1.breed);


            System.out.println("==============================");

            dog d2 =new dog("Husky");
            System.out.println(d2.name);
            System.out.println(d2.age);
            System.out.println(d2.breed);


            System.out.println("==============================");

            dog d3 =new dog("Poodle",3);

            System.out.println(d3.name);
            System.out.println(d3.age);
            System.out.println(d3.breed);

            System.out.println("==============================");

            System.out.println(d3);
            System.out.println(d2);
            System.out.println(d1);

            System.out.println("==============================");

            dog d4= new dog("Jack Russel",4);


        }
    }

