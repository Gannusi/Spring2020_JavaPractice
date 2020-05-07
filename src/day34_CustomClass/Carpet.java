package day34_CustomClass;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost() {
        double total = (width + length) * unitPrice;

        if (isPersian) {
            return total + 200;

        } else {
            return total;

        }
        //return (isPersian) ? total+200 : total;

    }

    public void customOrder(double carperWidth, double carpetLength, double carpUnitPrice, boolean Persian) {

        width = carperWidth;
        length = carpetLength;
        unitPrice = carpUnitPrice;
        isPersian = Persian;

    }

    public String toString() {
        return "width: " + width +
                "\nlength: " + length +
                "\nunit price " + unitPrice +
                "\ncosts " + calcCost();
    }
}