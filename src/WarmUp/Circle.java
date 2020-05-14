package WarmUp;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    /*
      Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r

     */
    static double PI = 3.14;
    double radius;
    double diameter;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return diameter * PI;
    }

    public String toString() {
        return "Circles radius: " + radius +
                ", Circles diameter: " + diameter +
                ", Circles area: " + area() +
                ", Circles perimeter: " + perimeter();
    }
}

    class CircleObjects {
        public static void main(String[] args) {
            DecimalFormat df= new DecimalFormat("0.00");


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the radius of the circle ");
            double r =scan.nextDouble();

            Circle c1 = new Circle(r);

            System.out.println("Diameter is: "+c1.diameter);
            System.out.println("Perimeter is: "+c1.perimeter());
            System.out.println("Area is: "+df.format(c1.area()));
        }

    }