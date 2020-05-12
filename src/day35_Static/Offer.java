package day35_Static;

public class Offer {
    String location;
    String  company;
    double salary;
    boolean isFullTime;

    public void  setInfo(String  location, String company, double salary, boolean isFullTime){

        this.location= location;
        this.company= company;
        this.salary= salary;
        this.isFullTime=isFullTime;

    }

    public  String toString(){

        return "Company location: "+location+", company name: "+company+", your salary: $"+salary+" job is full-time: "+isFullTime;
    }

}
