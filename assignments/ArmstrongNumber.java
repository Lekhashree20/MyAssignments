package week1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int input = 1534;
		
		int calculated = 0;
				
		int remainder,original;
		
		original = input;
		
		while(original!=0)
		{
			
			remainder = original%10;//3
			calculated+=Math.pow(remainder, 3);//27
			original = original/10;//15
			
		}
		
		if(calculated==input)
		{
			System.out.println("The given number is Armstrong number");
		}
		else
			System.out.println("The given number is not Armstrong number");
		
	}

}
