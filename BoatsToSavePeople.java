package recursion;

import java.util.Arrays;

public class BoatsToSavePeople {

	public static void main(String[] args) {
		int[] peopleWeightList = { 3, 5, 3, 4 };
		int limit = 5;
		System.out.println(numRescueBoats(peopleWeightList, limit));
	}

//	public static int numRescueBoats(int[] people, int limit) {
//		Arrays.sort(people);
//		int i = 0;
//		int j = people.length - 1;
//		int totalBoatsRequired = 0;
//		int currentWeightOnBoat = 0;
//		int seatLeft=2;
//		while (!(j < i)) {
//			
//			while(seatLeft!=0) {
//				if (j >= i && currentWeightOnBoat + people[j] <= limit) {
//					currentWeightOnBoat = currentWeightOnBoat + people[j];
//					people[j] = 0;
//					j--;
//					seatLeft--;
//				} else if (i <= j && currentWeightOnBoat + people[i] <= limit) {
//					currentWeightOnBoat = currentWeightOnBoat + people[i];
//					people[i] = 0;
//					i++;
//					seatLeft--;
//				}else {
//					seatLeft=0;
//				}
//			}
//
//			totalBoatsRequired++;
//			currentWeightOnBoat = 0;
//			seatLeft=2;
//		}
//		return totalBoatsRequired;
//	}
		
		
		public static int numRescueBoats(int[] people, int limit) {
			Arrays.sort(people);
			int i = 0;
			int j = people.length - 1;
			int totalBoatsRequired = 0;
			int currentWeightOnBoat = 0;
			int seatLeft=2;
			while (i<=j) {
				
				while(seatLeft!=0) {
					if (j >= i && currentWeightOnBoat + people[j] <= limit) {
						currentWeightOnBoat = currentWeightOnBoat + people[j];
						people[j] = 0;
						j--;
						seatLeft--;
					} else if (i <= j && currentWeightOnBoat + people[i] <= limit) {
						currentWeightOnBoat = currentWeightOnBoat + people[i];
						people[i] = 0;
						i++;
						seatLeft--;
					}else {
						seatLeft=0;
					}
				}

				totalBoatsRequired++;
				currentWeightOnBoat = 0;
				seatLeft=2;
			}
			return totalBoatsRequired;
		}

	public static void printArray(int[] arr) {
		for (int n : arr) {
			System.out.print(n + ", ");
		}
		System.out.println(" ");
	}

}
