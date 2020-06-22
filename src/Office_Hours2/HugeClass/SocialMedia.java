package Office_Hours2.HugeClass;
/*

(*) Create an abstract class for Social Media that has the following features:
    - Direct messaging(String username, String message)
    - Post(String body)
    - Notifications(int time)
(*) The Social Media will also have the following fields:

    - Personal URl (String)
    - Account length (int)
    - Platform (static String)
-----------------------------------
Facebook User:
(*) Create a class for a facebook user which inherits the Social Media class and additional instance variables: username, password, full name, age, and number of friends
(*) Encapsulate all the variables.
(*) Create a constructor which will create a facebook user by taking username and password.
    - If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
    - Create and assign the the user's person url by taking 'facebook.com/' and adding their username
    - Set the account length to 0
    - Set the platform for "Facebook" using static block
(*) Overload the constructor to accept username, password, and the user’s name.
    - If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’
(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
    - Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
 */


    public abstract class SocialMedia {

        protected String personalUrl;
        protected int accountLength;
        protected static String platform;

        public abstract boolean directMessage(String username, String message);

        public abstract boolean createPost(String body);

        public abstract void notification(int time);





    }
