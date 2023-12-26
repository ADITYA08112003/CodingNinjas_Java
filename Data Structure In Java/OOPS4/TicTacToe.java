package OOPS4;

import java.util.Scanner;

//creating a Player class of the game
class Player{
//	instaneous variable
//	Encapsulation
	private String name;
	private char symbol;
	
//	create parameter Constructor
	public Player(String name,char symbol) {
		setName(name);
		setSymbol(symbol);
	}
//	setter method for name
	public void setName(String name) {
		if(!name.isEmpty()) {
			this.name=name;
		}
	}
//	getter method for name
	public String getName() {
		return this.name;
	}
//	setter for symbol
	public void setSymbol(char symbol) {
		if(symbol!='\0') {
			this.symbol=symbol;
		}
	}
//	getter for symbol
	public char getSymbol() {
		return this.symbol;
	}
}

//Creating a Board class of game
class Board{
	private char board[][];
	private int boardSize=3;
	private char p1Symbol,p2Symbol;
//	Count of number of cells that are filled .
	private int count;
	private static final char EMPTY=' ';
	
//	instant Variable for status
	public static final int PLAYER1WINS=1;
	public static final int PLAYER2WINS=2;
	public static final int DRAW=3;
	public static final int INCOMPLETE=4;
	public static final int INVALIDMOVE=5;
	
//	Parameterised Constructor of Board
	public Board(char p1Symbol,char p2Symbol) {
		board=new char[boardSize][boardSize];
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				board[i][j]=EMPTY;
			}
		}
		this.p1Symbol=p1Symbol;
		this.p2Symbol=p2Symbol;
	}
	
//	move method
	public int move(char symbol, int x, int y) {
		if(x<0 || x>=boardSize || y<0 || y>=boardSize || board[x][y]!=EMPTY) {
			return INVALIDMOVE;
		}
		
		board[x][y]=symbol;
		count++;
//		ROW
		if(board[x][0]==board[x][1] && board[x][0]==board[x][2]) {
			return symbol==p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
//		COLUMNS
		if(board[0][y]==board[1][y] && board[0][y]==board[2][y]) {
			return symbol==p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
//		DIAGONALS
		if(board[0][0]!=EMPTY && board[0][0]==board[1][1] && board[0][0]==board[2][2]) {
			return symbol==p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		if(board[0][2]!=EMPTY && board[2][0]==board[1][1] && board[2][0]==board[0][2]) {
			return symbol==p1Symbol ? PLAYER1WINS : PLAYER2WINS;
		}
		
		if(count==boardSize*boardSize) {
			return DRAW;
		}
		return INCOMPLETE;
	}
//	Print a Board
	public void print() {
		System.out.println("---------------");
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				System.out.print("| "+board[i][j]+" |");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("---------------");
	}
	
}
//Manager  Class
public class TicTacToe {
	private Player player1,player2;
	private Board board;
	private int numPlayers;
	
	public static void main(String args[]) {
		TicTacToe t=new TicTacToe();
		t.startGame();
	}
	
	public void startGame() {
		Scanner s=new Scanner(System.in);
//		Take Players input
		
//		player1=takePlayerInput(1);
//		player2=takePlayerInput(2);
		player1=takePlayerInput(++numPlayers);
		player2=takePlayerInput(++numPlayers);
//		check the both player have not same symbol
		while(player1.getSymbol()==player2.getSymbol()) {
			System.out.println("symbol already taken!! please enter the symbol again");
			player2.setSymbol(s.next().charAt(0));
		}
		
//		Create the board
		
		board =new Board(player1.getSymbol(),player2.getSymbol());
		
//		play the game.
		
		boolean player1Turn=true;
		int status=Board.INCOMPLETE;
		while(status==Board.INCOMPLETE || status==Board.INVALIDMOVE) {
			if(player1Turn) {
				System.out.println("Player 1 -"+player1.getName()+"'s turn");
				System.out.println("Enter x: ");
				int x=s.nextInt();
				System.out.println("Enter y: ");
				int y=s.nextInt();
				
				status=board.move(player1.getSymbol(),x,y);
//				if(status==5) {
				if(status==Board.INVALIDMOVE) {
					System.out.println("Invalid move !! Please try again !!");
					continue;
				}
//				else {
//					player1Turn=false;
//					board.print();
//				}
			}
			else {
				System.out.println("Player 2 -"+player2.getName()+"'s turn");
				System.out.println("Enter x: ");
				int x=s.nextInt();
				System.out.println("Enter y: ");
				int y=s.nextInt();
				
				status=board.move(player2.getSymbol(),x,y);
//				if(status==5) {
				if(status==Board.INVALIDMOVE) {
					System.out.println("Invalid move !! Please try again !!");
					continue;
				}
//				else {
//					player1Turn=true;
//					board.print();
//				}
			}
			player1Turn=!player1Turn;
			board.print();
		}
		if(status==Board.PLAYER1WINS) {
			System.out.println("Player1 - "+player1.getName()+"wins !!");
		}
		else if(status==Board.PLAYER2WINS) {
			System.out.println("Player2 - "+player2.getName()+"wins !!");
		}
		else {
			System.out.println("Draw !!");
		}
	}
	
//	player TakeInput
	private Player takePlayerInput(int num) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Player "+num+"name: ");
		String name=s.nextLine();
		System.out.println("Enter Player "+num+"symbol: ");
		char symbol=s.next().charAt(0);
		Player p=new Player(name,symbol);
		return p;
	}
}
