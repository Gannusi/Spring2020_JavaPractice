package Office_Hours.Practice_05_20_2020;

   /* Cat:
            variables:  name, age, color, size, breed, isPet, numberOfeyes
            methods: eat, sleep, drink, toString, scratch
    */

public class Cat extends Pet {

    public Cat(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }

    public  void scratch(){
        System.out.println(name+" is scratching");
    }

    public  Cat (){
        this("A",1,"S", "H","U");
    }
}
