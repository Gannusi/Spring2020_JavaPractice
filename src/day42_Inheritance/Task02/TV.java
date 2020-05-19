package day42_Inheritance.Task02;
/*
		create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString

 */

public class TV extends Device{
    /*
    brand, (Inherited)
    model,  (Inherited)
    price,   (Inherited)
    country,   (Inherited)
    Type  (Inherited)
    watch,
    toString  (Inherited)
     */
public void TV(String brand, String model, double price, String type){

}
    public  void watch(){
        System.out.println("Watching "+brand+" TV");
    }
    public  TV(String  brand, String model, double price, String type, String size){
    setDevice(brand, model, price, "TV", size);

    }
}
