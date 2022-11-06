package week1.assignments;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1234567891011L;
	boolean isPunctured = false;
	String bikeName = "HERO HONDA";
	double runningKM = 199000.90;
	
	
	public static void main(String[] args) {
		
		TwoWheeler obj1 = new TwoWheeler();
		System.out.println(obj1.noOfWheels);
		System.out.println(obj1.noOfMirrors);
		System.out.println(obj1.chassisNumber);
		System.out.println(obj1.isPunctured);
		System.out.println(obj1.bikeName);
		System.out.println(obj1.runningKM);
		
	}
}
