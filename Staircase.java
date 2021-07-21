package recursion;

import java.util.ArrayList;

public class Staircase {
	public static void main(String[] args) {
		int[] possibleStepsValue= {1,2,3};
		Staircase.getPossibleCombinationToClimbStep(0, 5, new ArrayList<Integer>(),possibleStepsValue);
	}
	
	private static void getPossibleCombinationToClimbStep(int stepsAlreadyCovered, int target, ArrayList<Integer> stepsRecord, int[] possibleSteps) {
		if(stepsAlreadyCovered==target) {
			System.out.println(stepsRecord);
			return;
		}
		
		if(stepsAlreadyCovered>target) {
			return;
		}
		
		for(int step:possibleSteps) {
			ArrayList<Integer> newStepComb = new ArrayList<>(stepsRecord);
			newStepComb.add(step);
			getPossibleCombinationToClimbStep(stepsAlreadyCovered+step, target, newStepComb, possibleSteps);
		}
		return;
	}
}
