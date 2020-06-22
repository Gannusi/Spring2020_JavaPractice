package day49_Polymorphism;

public final class Iphone extends Phone implements AppleApps  {

    static{
        brand ="iPhone";
    }

    public Iphone(String  model, double price, String size) {
       this.model =model;
       this.price =price;
       this.size =size;

    }

    @Override
    public void downloadable() {
        System.out.println("iPhone is downloaded " +AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting to "+ phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling "+ phoneNumber);
    }

    public  void faceTiming(long phoneNumber){
        System.out.println("iPhone is face Timing "+ phoneNumber);
    }




}
