package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MergeIntervals {

	public static void main(String[] args) {
		int[][] arr = { {0, 0 }, {3,3},{ 4, 5 }, { 6, 8 } };

		int[][] list = merge(arr);

		for (int i = 0; i < list.length; i++) {
			System.out.println(Arrays.toString(list[i]));
		}

	}

	public static int[][] merge(int[][] intervals) {

		if (intervals.length == 1) {
			return intervals;
		}

		ArrayList<Point> points = new ArrayList<>();
		ArrayList<Line> lines = new ArrayList<>();

		for (int i = 0; i < intervals.length; i++) {
			points.add(new Point(true, intervals[i][0]));
			points.add(new Point(false, intervals[i][1]));
		}

		Collections.sort(points);
//		System.out.println(points);

		Stack<Point> stack = new Stack<>();

		int counter = 0;

		for (int i = 0; i < points.size(); i++) {
			if (stack.isEmpty()) {
				counter++;
			} else {
				Point p1 = stack.peek();
				if (p1.xCor == points.get(i).xCor && p1.isStartingPoint != points.get(i).isStartingPoint) {
					stack.pop();
					if (stack.isEmpty()) {
						lines.add(new Line(p1.xCor, points.get(i).xCor));
					}
					continue;
				}
			}

			if (points.get(i).isStartingPoint) {
				stack.push(points.get(i));
				continue;
			}

			Point p1 = stack.pop();

			if (stack.isEmpty()) {
				lines.add(new Line(p1.xCor, points.get(i).xCor));
			}
		}

		int[][] res = new int[counter][2];
		for (int i = 0; i < res.length; i++) {
			res[i] = lines.get(i).getPoints();
		}

		return res;
	}

}

class Line {
	int x1;
	int x2;

	public Line(int x1, int x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
	
	@Override
	public String toString() {
		return "("+this.x1+", "+this.x2+")";
	}

	public int[] getPoints() {
		int[] points = { this.x1, this.x2 };
		return points;
	}
}

class Point implements Comparable<Point> {
	boolean isStartingPoint;
	int xCor;

	public Point(boolean isStartingPoint, int xCor) {
		this.isStartingPoint = isStartingPoint;
		this.xCor = xCor;
	}

	@Override
	public int compareTo(Point o) {
		if (this.xCor - o.xCor == 0) {
			int temp1 = this.isStartingPoint ? 1 : 0;
			int temp2 = o.isStartingPoint ? 1 : 0;
			return temp2 - temp1;
		}
		return this.xCor - o.xCor;
	}

	@Override
	public String toString() {
		return xCor + " " + isStartingPoint;
	}
}