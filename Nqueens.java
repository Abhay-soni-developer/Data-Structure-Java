package recursion;

public class Nqueens {

	public static void main(String[] args) {

		nQueen();

	}
	
	static int count = 0;
	
	public static void nQueen() {
		int[][] board = { { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 } };
		findNextFeasiblePositionOfQueen(board, 0, 0);
		System.out.println("total solution count :: " + Nqueens.count);
	}

	public static void findNextFeasiblePositionOfQueen(int[][] board, int row, int col) {
		if (row == board.length) {
			count++;
			printBoard(board);
		}

		while (row < board.length) {
			while (col < board.length) {
				if (findIfQueenCutsAnotherQueen(board, row, col)) {
					col = col + 1;
					continue;
				} else {
					board[row][col] = 1;
					findNextFeasiblePositionOfQueen(board, row + 1, 0);
					board[row][col] = 0;
					col = col + 1;
					continue;
				}
			}
			return;
		}

		return;
	}

	public static void resetRow(int[][] board, int row) {
		int[] newRow = { 0, 0, 0, 0 };
		board[row] = newRow;
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

	public static boolean findIfQueenCutsAnotherQueen(int[][] board, int playerRowPos, int playerColPos) {

		int row = playerRowPos;
		int col = playerColPos;

		// for col
		for (int i = row; i > -1; i = i - 1) {
			if (board[i][playerColPos] == 1) {
				return true;
			}
		}

		// for daigonals
		while (row > -1 && col > -1) {
			if (board[row][col] == 1) {
				return true;
			}
			row--;
			col--;
		}

		row = playerRowPos;
		col = playerColPos;

		while (row > -1 && col < board.length) {
			if (board[row][col] == 1) {
				return true;
			}
			row--;
			col++;
		}

		return false;
	}

}
