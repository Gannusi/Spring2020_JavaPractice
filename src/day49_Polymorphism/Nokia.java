package day49_Polymorphism;

public class Nokia extends Phone implements AndroidApps {

    static {
        brand="Nokia";
    }

    public Nokia(String model, double price, String size){
        this.model=model;
        this.size= size;
        this.price=price;

    }
    @Override
    public void downloadable() {

    }

    @Override
    public void texting(long phoneNumber) {

    }

    @Override
    public void calling(long phoneNumber) {

    }

    public  void freezing(){
        System.out.println("Nokia is freezing");
    }
    public void breakTheFlor(){
        System.out.println("Nokia is breaking the floor");
    }
}
