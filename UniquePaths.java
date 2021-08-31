package recursion;

import java.util.Arrays;

public class UniquePaths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3,7));
	}

	public static int uniquePaths(int m, int n) {
		int[][] maze=new int[m][n];
		maze[m-1][n-1]=1;
		uniquePaths(maze, m);
		return maze[0][0];
	}
	
	public static void uniquePaths(int[][] maze, int row) {
		
		if(row==0) {
			return;
		}
		
		for(int i=maze[0].length-1; i>=0; i--) {
			if(maze[row-1][i]==0) {
				int temp=0;
				if(row-1<maze.length-1) {
					temp+=maze[row][i];
				}
				
				if(i+1<maze[0].length) {
					temp+=maze[row-1][i+1];
				}
				maze[row-1][i]=temp;
			}
		}
		
		uniquePaths(maze, row-1);
	}
	
	public static void printMaze(int[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			System.out.println("");
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
		}
		System.out.println(" ");
	}
}
