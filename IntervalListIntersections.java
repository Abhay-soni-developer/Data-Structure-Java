package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


public class IntervalListIntersections {

	public static void main(String[] args) {
		int[][] firstList = {{0,2},{5,10},{13,23},{24,25}}, secondList = {{1,5},{8,12},{15,24},{25,26}};
		int[][] res = intervalIntersection(firstList, secondList);
		
		for(int i=0; i<res.length; i++) {
			System.out.println(Arrays.toString(res[i]));
		}
		
	}
	
	
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    	ArrayList<Point> points = new ArrayList<>();
    	ArrayList<Line> lines = new ArrayList<>();
    	Stack<Point> stk = new Stack<>();
    	
    	for(int i=0; i<firstList.length; i++) {
    		points.add(new Point(true, firstList[i][0]));
    		points.add(new Point(false, firstList[i][1]));
    	}
    	
    	for(int i=0; i<secondList.length; i++) {
    		points.add(new Point(true, secondList[i][0]));
    		points.add(new Point(false, secondList[i][1]));
    	}
    	
    	Collections.sort(points);
    	Iterator itr = points.iterator();
    	
    	
    	while(itr.hasNext()) {
    		Point temp = (Point)itr.next();
    		
    		if(stk.isEmpty()) {
    			stk.push(temp);
    			continue;
    		}
    		
    		Point topNode = stk.peek();
    		
    		if(topNode.isStartingPoint && !temp.isStartingPoint){
    			Line line = new Line(topNode.xCor, temp.xCor);
    			stk.pop();
    			if(!stk.isEmpty()) {
    				lines.add(line);
    			}
    			continue;
    		}
    		
    		stk.push(temp);
    	}
    	
    	itr = lines.iterator();
    	int[][] res = new int[lines.size()][2];
    	int i=0;
    	
    	while(itr.hasNext()) {
    		res[i] = ((Line)itr.next()).getPoints();
    		i++;
    	}
    	
        return res;
    }

}

