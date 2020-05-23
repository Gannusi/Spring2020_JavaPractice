package Office_Hours.Practice_05_20_2020;

public class House {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rosie", 1,"white", "small","Cavapoo");
        //dog1.setInfo("Karabas",5,"black","large","Husky");
        System.out.println(dog1);

        Dog dog2 = new Dog("Karabas",5,"black","large","Husky");
        System.out.println(dog2);

        Cat cat1 = new Cat("Bonbon", 2, "Brown", "Small", "Abyssinian");
        //cat1.setInfo("Bonbon", 2, "Brown", "Small", "Abyssinian");
        System.out.println(cat1);

        Bunny bunny1 = new Bunny("Pamuk",1,"white","small","Holland lop");
        System.out.println(bunny1);



    }
}
