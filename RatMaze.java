package recursion;

import java.util.ArrayList;
import java.util.Stack;

public class RatMaze {
	 static int totalPossibleWay = 0;	
	public static void main(String[] args) {
		
		int[][] maze = { 
				{ 0, 0, 1, 0, 0, 1, 0 }, 
				{ 1, 0, 1, 1, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 1, 0, 1 }, 
				{ 1, 0, 1, 0, 0, 0, 0 },
				{ 1, 0, 1, 1, 0, 1, 0 },
				{ 1, 0, 0, 0, 0, 1, 0 },
				{ 1, 1, 1, 1, 0, 0, 0 },
		};
		
		int[] destination = {maze.length-1, maze.length-1};
		int[] startPos = {0, 0};
//		printMaze(maze);
		RatMaze.solveRatMaze(maze, destination, startPos);
		System.out.println(RatMaze.totalPossibleWay);
	}
	
	public static void solveRatMaze(int[][] maze, int[] destination, int[] startPos) {
		//1 means down , -1 right 
		Stack<Integer> sol = new Stack<>();
		ratMaze(maze, destination, startPos, sol);
	}
	
	private static void ratMaze(int[][] maze, int[] destination, int[] currentPos, Stack<Integer> sol) {
		if(destination[0]==currentPos[0] && destination[1]==currentPos[1]) {
			RatMaze.totalPossibleWay++;
		}
		
//		for right direction
		if(currentPos[1]<maze.length-1 &&  maze[currentPos[0]][currentPos[1]+1]==0) {
			sol.push(1);
			int[] newPos = {currentPos[0], currentPos[1]+1};
			ratMaze(maze, destination, newPos, sol);
			sol.pop();
		}

		
//		for downword direction
		if (currentPos[0]<maze.length-1 && maze[currentPos[0]+1][currentPos[1]]==0){
			sol.push(-1);
			int[] newPos = {currentPos[0]+1, currentPos[1]};
			ratMaze(maze, destination, newPos, sol);
			sol.pop();
		}

	}
	
	public static void printMaze(int[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			System.out.println("");
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[i][j] + " ");
			}
		}
		System.out.println(" ");
	}
	

}
