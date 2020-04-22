package day07_IfStatments;

public class VoteTrump {

/*
 write a java program that can identify
 if a person is eligible to vote for Donald Trump

 */

    public static void main(String[] args) {

        int age = 18;

        boolean eligibleVoteAge = age > 18 ||  age == 18;

        if(eligibleVoteAge){
            System.out.println("A person is eligible to vote for Donald Trump");
        }

        if(!eligibleVoteAge){
            System.out.println("A person is NOT eligible to vote for Donald Trump");
        }


        System.out.println ( 10/3.0 );



    }

}
