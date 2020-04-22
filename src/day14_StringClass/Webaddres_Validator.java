package day14_StringClass;

public class Webaddres_Validator {

    public static void main(String[] args) {


        String website = "WWW.cybertek.Gov";
        website = website.toLowerCase();

        boolean validEnding = website.endsWith(".com") || website.endsWith(".edu") ||
                website.endsWith(".gov") || website.endsWith(".net");

        if (website.startsWith("www.") & validEnding) {
            System.out.println("Valid address");

        } else {
            System.out.println("Invalid address");

        }

    }
}