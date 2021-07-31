package recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class WordSearch {

	static int[][] newPosTactics = { { 0, 1, 0, -1 }, { 1, 0, -1, 0 } };

	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//		char[][] board = { { 'a', 'a', 'a', 'a' }, { 'a', 'a', 'a', 'a' }, { 'a', 'a', 'a', 'a' } };
		String searchWord = "ABCCED";
		WordSearch ws = new WordSearch();
		System.out.println(ws.exist(board, searchWord));
		printBoard(board);
	}

	public boolean exist(char[][] board, String word) {
		if(word.length() > (board.length * board[0].length)) return false;
		printBoard(board);
		ArrayList<int[]> posList = searchChar(board, word.charAt(0));
		Iterator it = posList.iterator();
		while (it.hasNext()) {
			int[] pos = (int[]) it.next();
			if (searchWord(board, word, pos, 0)) {
				return true;
			}
		}
		return false;
	}

	public static ArrayList<int[]> searchChar(char[][] board, char ch) {
		ArrayList<int[]> posList = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == ch) {
					int[] pos = { i, j };
					posList.add(pos);
				}
			}
		}
		return posList;
	}

	public static boolean searchWord(char[][] board, String word, int[] pos, int count) {

		if (word.length() == count + 1) {
			if (board[pos[0]][pos[1]] == word.charAt(count)) {
				return true;
			}
		}

		printBoard(board);

		for (int i = 0; i < newPosTactics[0].length; i++) {
			int[] newPos = { pos[0] + newPosTactics[0][i], pos[1] + newPosTactics[1][i] };
			if (newPos[0] >= 0 && newPos[0] < board.length) {
				if (newPos[1] >= 0 && newPos[1] < board[0].length) {
					if (board[newPos[0]][newPos[1]] == word.charAt(count + 1)) {
						board[pos[0]][pos[1]] = '\u0000';
						boolean flag = searchWord(board, word, newPos, count + 1);
						board[pos[0]][pos[1]] = word.charAt(count);
						if (flag) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.println("");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
		}
		System.out.println(" ");
	}

}
