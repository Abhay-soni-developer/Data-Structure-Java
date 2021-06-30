package recursion;

public class ParkingSystem {
	private int[] availableSpace = new int[3];
	
	public static void main(String[] args) {
		ParkingSystem pk = new ParkingSystem(1, 1, 0);
		
		for(int sp:pk.availableSpace) {
			System.out.println(sp);
		}
		System.out.println(pk.addCar(1));
		System.out.println(pk.addCar(2));
		System.out.println(pk.addCar(3));
		System.out.println(pk.addCar(1));
		for(int sp:pk.availableSpace) {
			System.out.println(sp);
		}
	}
	
    public ParkingSystem(int big, int medium, int small) {
        availableSpace[0]=big;
        availableSpace[1]=medium;
        availableSpace[2]=small;
    }
    
    public boolean addCar(int carType) {
        if(availableSpace[carType-1]>0) {
        	availableSpace[carType-1]-=1;
        	return true;
        }else {
        	return false;
        }
    }

}
