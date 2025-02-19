package elite.com;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_game 
{
   public static void main(String[] args) 
    {
	         Scanner scanner = new Scanner(System.in);
	           Random random = new Random();
	           
	           int lowerBound = 1;
	           int upperBound = 20;
	           int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	           int attempts = 5;
	           boolean hasWon = false;
	           
	           System.out.println("Welcome to the Number Guessing Game!");
	           System.out.println("Guess the number between " + lowerBound + " and " + upperBound);
	           System.out.println("You have " + attempts + " attempts.");
	           
	           for (int i = 1; i <= attempts; i++) {
	               System.out.print("Attempt " + i + ": Enter your guess: ");
	               int playerGuess = scanner.nextInt();
	               
	               if (playerGuess == numberToGuess) {
	                   hasWon = true;
	                   break;
	               } else if (playerGuess < numberToGuess) {
	                   System.out.println("Too low! Try again.");
	               } else {
	                   System.out.println("Too high! Try again.");
	               }
	           }
	           
	           if (hasWon) {
	               System.out.println("Congratulations! You guess Number is right");
	           } else {
	               System.out.println("Sorry, you've used all attempts. The number was: " + numberToGuess);
	           }
	           
	           scanner.close();
    }
}
