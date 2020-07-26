
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {	

// TicTacToe'da karakter kullanacagimiz icin 'char Array'i yazdik:
		
		char [] []	gameBoard = {{' ','|',' ','|',' '}, // Array'in icine,  3 rows ve aralarda 2 cizgi olacagi icin 5 parantez yaptik.
								 {'-','+','-','+','-'},
								 {' ','|',' ','|',' '},
								 {'-','+','-','+','-'},
								 {' ','|',' ','|',' '}}; 
					
		printGameBoard(gameBoard);  	// bu method, game boardu yazar.
		
		while (true) {  // game bir kere calisip durmasin diye 'while' icine koyduk.
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter your placement (1-9):  ");
			int playerPos = kb.nextInt();
			while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)) {
				System.out.println("Position taken! Enter a correct position: ");
				playerPos = kb.nextInt();
			}
			
			placePiece(gameBoard, playerPos, "player");
			   
			String result = checkWinner();
			if (result.length()>0 ) {
				System.out.println(result);
				break;
			} 	
		
// bu kisim 'cpu' calissin diye.
		
			Random rand = new Random();
			int cpuPos = rand.nextInt(9)+1;
			while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
				//System.out.println("Position taken! Enter a correct position: ");
				cpuPos = rand.nextInt(9)+1;
			}
			placePiece(gameBoard, cpuPos, "cpu");
			
			printGameBoard(gameBoard);  
		
			result = checkWinner();
			if (result.length()>0 ) {
				System.out.println(result);
				break;
			} 
		
		}
		
	} // end of the main method.
// main methodun ici kalabalik olmasin diye, asagida game boardun koduna method yazdik, yukarida  game board icin  sadece bu metodu cagiracak.:	


	
	
	
	public static void printGameBoard (char [] [] gameBoard) {

// Bu 'for loop' game board'u yazar:		
		for (char [] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	
	public static void placePiece (char [][] gameBoard, int position, String user) {
	
		char symbol = ' ';
		if (user.equalsIgnoreCase("player")) {
			symbol = 'X';
			playerPositions.add(position);
		} else if (user.equalsIgnoreCase("cpu")) {  // 'cpu' means 
			symbol = 'O';
			cpuPositions.add(position);
		}
		switch (position) {
			case 1:  // [row] [column]
				gameBoard [0] [0] = symbol;   // ilk once symbol yerine 'X' yazmistik.hangi numarayi dersek oraya X koyuyordu.
				break;
			case 2: 
				gameBoard [0] [2] = symbol;
				break;
			case 3: 
				gameBoard [0] [4] = symbol;
				break;
			case 4: 
				gameBoard [2] [0] = symbol;
				break;
			case 5: 
				gameBoard [2] [2] = symbol;
				break;
			case 6: 
				gameBoard [2] [4] = symbol;
				break;
			case 7: 
				gameBoard [4] [0] = symbol;
				break;
			case 8: 
				gameBoard [4] [2] = symbol;
				break;
			case 9: 
				gameBoard [4] [4] = symbol;
				break;
			default:
				break;
		}
	}
	
	public static String checkWinner() {
		
		List topRow = Arrays.asList (1,2,3);
		List midRow = Arrays.asList (4,5,6);
		List botRow = Arrays.asList (7,8,9);
		List leftCol = Arrays.asList (1,4,7);
		List midCol = Arrays.asList (2,5,8);
		List rightCol = Arrays.asList (3,6,9);
		List cross1 = Arrays.asList (1,5,9);
		List cross2 = Arrays.asList (7,5,3);
	 
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
	
		for (List l : winning) {
			if (playerPositions.containsAll(l)) {
				return "Congrats, you won!";
			}else if (cpuPositions.containsAll(l)) {
				return "Sorry, CPU won :(";
			}else if (playerPositions.size() + cpuPositions.size() == 9) {
				return "Tie!";
			}
		}
		return "";
	
	}

	
}
