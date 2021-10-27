import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        String personPlay;
        String computerPlay = "";
        int computerInt;
        String response;


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Hey, let's play Rock, Paper, Scissors!\n" +
                "Please enter a move.\n" + "Rock, Paper" +
                ", and Scissors.");

        System.out.println();
        computerInt = generator.nextInt(3)+1;



        if (computerInt == 1)
            computerPlay = "Rock";
        else if (computerInt == 2)
            computerPlay = "Paper";
        else if (computerInt == 3)
            computerPlay = "Scissors";


        System.out.println("Enter your play: ");
        personPlay = scan.next();


        personPlay = personPlay.toUpperCase();


        System.out.println("Computer play is: " + computerPlay);




        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else if (computerPlay.equals("P"))
                System.out.println("Paper eats rock. You lose!!");
            else if (personPlay.equals("P"))
                if (computerPlay.equals("S"))
                    System.out.println("Scissor cuts paper. You lose!!");
                else if (computerPlay.equals("R"))
                    System.out.println("Paper eats rock. You win!!");
                else if (personPlay.equals("S"))
                    if (computerPlay.equals("P"))
                        System.out.println("Scissor cuts paper. You win!!");
                    else if (computerPlay.equals("R"))
                        System.out.println("Rock breaks scissors. You lose!!");
                    else
                        System.out.println("Invalid user input.");
    }
}
