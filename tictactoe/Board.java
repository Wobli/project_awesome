package tictactoe;

public class Board {
	
	int numberOfPlayers;
	private int boardSize;
	public String[][] getPlayingBoard() {
		return playingBoard;
	}


	public void setPlayingBoard(String[][] playingBoard) {
		this.playingBoard = playingBoard;
	}


	private String[][] playingBoard;
	private int default_numberOfPlayers = 2;
	private int default_boardSize = 2;
	
	

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}	
	
	
	public Board(int number, int boardSize) {
		numberOfPlayers = number;
		playingBoard = new String[boardSize][boardSize];
		}
	
	public Board() {
		numberOfPlayers = default_numberOfPlayers;
		playingBoard = new String[default_boardSize][default_boardSize];
	}
	
	void initializeBoard(int boardSize) {
		for(int x = 0; x <= boardSize; x++) {
			for(int y = 0; y <= boardSize; y++) {
				System.out.print(playingBoard[x][y]+" ");
			}
			System.out.println("");
		}
	}

	void printBoard() {
		int x;
		int y;
		System.out.println(boardSize);
		for(x = 0; x <= boardSize; x++) {
			System.out.println("Is anything happening?");
			System.out.println(x);
			for(y = 0; y <= boardSize; y++) {
				System.out.print(playingBoard[x][y]+" ");
			}
			System.out.println("");
		}
	}
	
	
	
	
	
	}
