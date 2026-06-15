import java.util.Scanner;

public class PartyAffiliation {
    static void main(String[] args) {
        //get user input
        //initialize partyAffiliation variable as a string
        //check if input is a single letter
        //check if affiliation is D, R, I, or other
        //print respective party message
        //print invalid input message

        Scanner in = new Scanner(System.in);
        String partyAffiliation = "";
        System.out.print("Enter the first capital letter of your party affiliation (D, R, I, or anything other letter for other: ");
        partyAffiliation = in.next();

        if (partyAffiliation.length() == 1 && Character.isLetter(partyAffiliation.charAt(0))) {
            if (partyAffiliation.equals("D")) {
                System.out.println("You get a Democratic Monkey! ");
            } else if (partyAffiliation.equals("R")) {
                System.out.println("You get a Republican Elephant! ");
            } else if (partyAffiliation.equals("I")) {
                System.out.println("You get an Independent Man! ");
            } else {
                System.out.println("You get a other worldly creature! ");
            }
        } else {
            System.out.println("Your input " + partyAffiliation + " is not a valid input. Please enter a single letter.");
        }
    }
}