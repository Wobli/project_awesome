package tictactoe;

import java.util.Scanner;

/**
 * @author Christian Remi Wewer
 *
 */
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Get input for number of players 
		Scanner reader = new Scanner(System.in);
		System.out.println("How many players will play the game?");
		System.out.print("> ");
		int numberOfPlayers = reader.nextInt();
		System.out.println("What is the size of the playing board?");
		System.out.print("> ");
		int boardSize = reader.nextInt();
		reader.close();
		//create new game board
		Board firstgame = new Board(numberOfPlayers,boardSize); // Remember to check for input
		System.out.println("The number of players in the game are: "+firstgame.getNumberOfPlayers());
		
		firstgame.initializeBoard(boardSize);
		String a[][] = firstgame.getPlayingBoard();
		System.out.println(a.length);
		System.out.println(a[0].length);
	
		
	}

}
