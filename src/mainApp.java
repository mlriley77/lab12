import java.util.Scanner;

/*

Known Issues
1.No mater what data is entered, it will come out as mike "sout on userPick in HUMAN"
2. if statements to seperate opponents
3. where to put the comparison results to determine winner


*/

public class mainApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //create an array to store userInput???

        System.out.println("Welcome to Riley's Rock Paper Scissors!");
        System.out.println();

        System.out.println("Enter your name: ");
        String userName = scan.nextLine();
        Human h1  = new Human();//this is a test to get into back to classes
       // h1.name(userName);//use this to print result down below


        System.out.println("Would you like to play against TheJets or TheSharks (jets/sharks)? ");
        String userChoice = scan.nextLine();
        Human h2 = new Human();
        h2.oppChoice(userChoice);//use this to print result below "maybe"

        System.out.println("Rock, paper, or scissors? (R/P/S) ");
        String userPick2= scan.nextLine();
        Human h3 = new Human();
        h3.userPick(userPick2);

        //if (userChoice == "theSharks")
            TheSharks h4 = new TheSharks();
            h4.result(userChoice);
        //else if (userChoice == "theJets")
            TheJets h5 = new TheJets();
            h5.getRandom();












    }
}
