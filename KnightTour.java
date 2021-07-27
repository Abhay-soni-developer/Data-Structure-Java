package recursion;

import java.util.Stack;

public class KnightTour {
	private static int[][] possibleMoves = {
			{ 2, 1, -1, -2, -2, -1, 1, 2 }, 
			{ 1, 2, 2,   1, -1, -2, -2, -1 }
	};
	
	
	public static void main(String[] args) {
//		int boardSize = Integer.parseInt(args[0]);
		int boardSize = 8;
		int[][] chessBoard = new int[boardSize][boardSize];
		int[] startPos = {0, 0};
		knightTour(chessBoard, startPos);
	}
	
	private static void knightTour(int[][] chessBoard, int[] startPos ) {
		KnightTour.giveKnightATour(chessBoard, startPos, 1);
	}
	
	
	
	private static void giveKnightATour(int[][] chessBoard, int[] currentPos, int posCounter) {
		
		if(posCounter==64) {
			chessBoard[currentPos[0]][currentPos[1]]=posCounter;
			printBoard(chessBoard);
			chessBoard[currentPos[0]][currentPos[1]]=0;
			return;
		}
		
//		iterate through all moves and try all possible moves
		for(int i=0; i<8; i++) {
			int newXCor = currentPos[0] + possibleMoves[0][i];
			int newYCor = currentPos[1] + possibleMoves[1][i];
			if(newXCor>=0 && newXCor<8 && newYCor>=0 && newYCor<8) {
				if(chessBoard[newXCor][newYCor]==0) {
//					mark currentPos with stepNum
					chessBoard[currentPos[0]][currentPos[1]]=posCounter;
					int[] newCor = {newXCor, newYCor};
					giveKnightATour(chessBoard, newCor, posCounter+1);
//					undo mark
					chessBoard[currentPos[0]][currentPos[1]]=0;
				}
			}
		}
		
	}
	
	public static void printBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.println("");
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
		}
		System.out.println(" ");
	}

}

class Coordinates {
	int x;
	int y;
	
	public int[] getCordinate() {
		int[] cor = {this.x, this.y};
		return cor;
	}
	
	public Coordinates(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
