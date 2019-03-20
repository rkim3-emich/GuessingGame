
/**
 * Generates random number for a user to guess.
 *
 * @author (Ryan Kim)
 * @version (3-20-19)
 */
import java.util.*;
public class GuessingGame
{
    public static void main(String[] args) {
        String answer;
        int gamesPlayed = 0;
        int bestScore = 0;
        
        // Print programmer information
        System.out.println("Programmer: Ryan Kim");
        System.out.println("Course:     COSC 111, Winter 2019");
        System.out.println("Lab#:       Take Home Project #1, part1");
        System.out.println("Due Date:   3-20-2019\n");
        
        //loop the program
        do {
        //Initialize variables
        int target;
        int guess;
        int count = 0;
        
        //Generate random number
        Random randomNumber = new Random();
        target = randomNumber.nextInt(100) + 1;
        
        //take user guess
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        guess = sc.nextInt();
        count++;
        if (guess != target) {
            if (guess < target)
                System.out.println("The number is higher. Try again.");
            else
                System.out.println("The number is lower. Try again.");
            while(guess != target) {
                System.out.print("Guess a number between 1 and 100: ");
                guess = sc.nextInt();
                count++;
                if (guess < target)
                System.out.println("The number is higher. Try again.");
                else if (guess > target)
                System.out.println("The number is lower. Try again.");
                else
                System.out.println("You guessed correctly!");
            }
        }
        else 
            System.out.println("You guessed correctly!");
            
        //Print score
        System.out.println("Your score is: " + count);
        
        //find best score over games played
        if (gamesPlayed == 0) {
            bestScore = count;
        }
        else {
            if (count < bestScore){
                bestScore = count;
            }
        }
        gamesPlayed++;
        
        //Ask user if they want to play again
        System.out.println("\nPlay another game, yes (or no): ");
        answer = sc.next();
        } while (answer.equalsIgnoreCase("YES"));
        
        //Print game summary
        System.out.println("Game summary");
        System.out.println("\tNumber of games played:    " + gamesPlayed);
        System.out.println("\tBest score:                " + bestScore);
    }
}
/*
Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       Take Home Project #1, part1
Due Date:   3-20-2019

Guess a number between 1 and 100: 50
The number is higher. Try again.
Guess a number between 1 and 100: 70
The number is higher. Try again.
Guess a number between 1 and 100: 9
The number is higher. Try again.
Guess a number between 1 and 100: 90
The number is lower. Try again.
Guess a number between 1 and 100: 80
The number is higher. Try again.
Guess a number between 1 and 100: 85
The number is lower. Try again.
Guess a number between 1 and 100: 83
You guessed correctly!
Your score is: 7

Play another game, yes (or no): 
yes
Guess a number between 1 and 100: 50
The number is higher. Try again.
Guess a number between 1 and 100: 75
The number is lower. Try again.
Guess a number between 1 and 100: 62
You guessed correctly!
Your score is: 3

Play another game, yes (or no): 
no
Game summary
	Number of games played:    2
	Best score:                3
*/
