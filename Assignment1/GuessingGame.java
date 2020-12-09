/**
 * Program for user to guess a number between 1 and 100
 */
package com.ss.basics.assignment;
import java.util.Random;
import java.util.Scanner;
/**
 * @author yashe
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// generate random number
		Random num = new Random();
		//initalize random number to correct guess
		int correctGuess = num.nextInt(100);
		// giving number of tries
		int numberGuesses = 5;
		// allows input from the user
		Scanner input = new Scanner(System.in);
		int guess;
		boolean correct = false;
		// while loop until correct becomes true
		while (correct == false) {
			// for loop to iterate to number of tries
			for(int i =0; i<numberGuesses; i++) {
				System.out.println("Guess a number between 1 and 100: ");
				guess = input.nextInt();
				if(guess <= correctGuess + 10 && guess >= correctGuess - 10) {
					correct = true;
					System.out.println("You have guessed the correct answer!");
				} else {
					System.out.println("Guess again");
				}
			}
			System.out.println("Sorry the correct number was:" + correctGuess);
		}
	}
}
