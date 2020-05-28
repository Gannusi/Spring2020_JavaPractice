package day44_Exceptions;
/*
	1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser actions
 */
public class Browsers {

    protected  void openBrowser(){

        System.out.println("Open default browser");
    }
    protected void closeBrowser(){
        System.out.println("Closing default browser");
    }
}


class ChromeBrowser extends  Browsers{
    //openBrowser()
    //closeBrowser()

    public  void openBrowser(){
        System.out.println("Open Chrome browser");

    }
    public  void  closeBrowser(){
        System.out.println("Close Chrome browser");

    }
}


class FirefoxBrowser extends  Browsers{

    public  void openBrowser(){
        System.out.println("Open Firefox browser");

    }
    public  void  closeBrowser(){
        System.out.println("Close Firefox browser");

    }

}



class Test{

    public static void main(String[] args) {
        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();

        System.out.println("========================================================");

        FirefoxBrowser obj2 = new FirefoxBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();
    }
}
