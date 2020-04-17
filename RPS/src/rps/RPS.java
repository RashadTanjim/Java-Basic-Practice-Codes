package RPS;

import java.util.Scanner;
import java.util.Random;

public class RPS {

	public static void main(String[] args) {
		int p1Move = 0; // variable for player1 Move (R/P/S)
		int p2Move = 0; // variable for player1 Move (R/P/S)
		int p1Wins = 0; // Initialised variables for Wins keeping PlayerOne,
		int p2Wins = 0; // Player Two
		int tie = 0; // Ties
		int rounds = 0; // number of rounds played
		String loop = "yes"; // Start loop
		Scanner input = new Scanner(System.in); // Creates scanner object

		System.out.println("Lets Play Rock Paper Scissors");
		System.out.println("You know the Rules");

		while (loop.equals("yes")) // This loop keeps our game going only while
									// our string.loop is equal to 'yes'
		{
			// p1Move=rgen.nextInt(3)+1;
			System.out
					.println("{Player One} please choose -- Rock[r] Paper[p] Scissors[s] Exit[x]");
			String c1Input = input.nextLine(); // variable for players Move
												// (R/P/S/X)
			String c1Move = c1Input.toUpperCase(); // Converts to Upper case in
													// case user did not
			System.out
					.println("{Player Two} please choose -- Rock[r] Paper[p] Scissors[s] Exit[x]");
			String c2Input = input.nextLine(); // variable for players Move
												// (R/P/S/X)
			String c2Move = c2Input.toUpperCase(); // Converts to Upper case in
													// case user did not

			// its nicer to use the letters r.p.s and its easier to deal in the
			// background with numbers

			if (c1Move.equals("R")) {
				p1Move = 1;
			}
			if (c1Move.equals("P")) {
				p1Move = 2;
			}
			if (c1Move.equals("S")) // This converts pMove to the numeric value
									// for "Rock"
			{
				p1Move = 3;
			}
			if (c2Move.equals("R")) {
				p2Move = 1;
			}
			if (c2Move.equals("P")) {
				p2Move = 2;
			}
			if (c2Move.equals("S")) {
				p2Move = 3;
			}
			if (c2Move.equals("X")) // This converts pMove to the numeric value
									// for "End"
			{
				p2Move = 4;
			}
			if (c1Move.equals("X")) {
				p1Move = 4;
			}

			if (p1Move == p2Move & p1Move != 4 & p2Move != 4) // Takes care of
																// Ties
			{
				System.out.println("Tie Game!");
				System.out.println("");
				tie++;
				rounds++;
			} else // scoring for non-tie events
			{
				if (p1Move == 1 && p2Move == 3) // Computer picks Rock and
												// player has Scissors - adds
												// point to Wins and rounds
				{
					System.out
							.println("Player1 picked Rock! \n Rock beats Scissors! \n **Player1 Wins! \n**");
					p1Wins++;
					rounds++;
				}

				if (p1Move == 1 && p2Move == 2) // Computer picks Rock and
												// player has Paper - adds point
												// to Wins and rounds
				{
					System.out
							.println("Player1 picked Rock! \n Paper beats Rock! \n **Player2 Wins!**");
					System.out.println("");
					p2Wins++;
					rounds++;
				}

				if (p1Move == 2 && p2Move == 3) // Computer picks Paper and
												// player has Scissors - adds
												// point to Wins and rounds
				{
					System.out
							.println("Player1 picked Paper! \n Scissors beats Paper! \n **Player2 Wins!**\n");
					p2Wins++;
					rounds++;
				}

				if (p1Move == 2 && p2Move == 1) // Computer picks Paper and
												// player has Rock - adds point
												// to Wins and rounds
				{
					System.out
							.println("Player1 picked Paper! \n Paper beats Rock!\n **Player1 Wins!** \n");
					p1Wins++;
					rounds++;
				}

				if (p1Move == 3 && p2Move == 1) // Computer picks Scissors and
												// player has Rock - adds point
												// to Wins and rounds
				{
					System.out
							.println("Player1 picked Scissors! \n Rock beats Scissors! \n **Player2 Wins!**");

					System.out.println("");
					p2Wins++;
					rounds++;
				}

				if (p1Move == 3 && p2Move == 2) // Computer picks Scissors and
												// player has Paper - adds point
												// to Wins and rounds
				{
					System.out
							.println("Player1 picked Scissors! \n Scissors beats Paper! \n **Player1 Wins!** \n");
					p1Wins++;
					rounds++;
				}
				if (p1Move == 4) // Computer picks Scissors and player has Paper
									// - adds point to Wins and rounds
				{
					System.out.println("Game Over, Player One Quit");
					System.out.println("THE FINAL SCORES AFTER " + rounds
							+ " ROUNDS: \n PLAYER 1\tPLAYER2\tTies");
					System.out.println(" " + p1Wins + "\t   " + p2Wins
							+ "\t\t " + tie);
					loop = "no"; // terminates the while loop keeping the game
									// going
				}
				if (p2Move == 4) // Computer picks Scissors and player has Paper
									// - adds point to Wins and rounds
				{
					System.out.println("Game Over, Player Two Quit");
					System.out.println("THE FINAL SCORES AFTER " + rounds
							+ " ROUNDS: \n PLAYER 1\tPLAYER2\tTies");
					System.out.println(" " + p1Wins + "\t" + p2Wins + "\t\t "
							+ tie);
					loop = "no"; // terminates the while loop keeping the game
									// going
				}
				if (p1Move == 4 & p2Move == 4) // Computer picks Scissors and
												// player has Paper - adds point
												// to Wins and rounds
				{
					System.out.println("Game Over, You both Quit");
					System.out.println("THE FINAL SCORES AFTER " + rounds
							+ " ROUNDS: PLAYER 1\tPLAYER2\tTies\n");
					System.out.println(" " + p1Wins + "\t" + p2Wins + "\t\t "
							+ tie);
					loop = "no"; // terminates the while loop keeping the game
									// going
				}
			}

		}
	}
}

