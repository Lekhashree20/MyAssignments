package week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {

		
		int firstNum = 0,secondNum = 1,sum,i;
		int range = 10;
		
		//initially n1 = 0, n2 = 1 , n3 = (0+1) =>1
		
		//n1 = n2 and n2 = n3    => n1 = 1 , n2 = 1
		
		System.out.print(firstNum+" "+secondNum);
		for(i = 2;i<range;++i)
		{
		sum = firstNum+secondNum;
		System.out.print(" "+sum);
		firstNum=secondNum;
		secondNum=sum;
		
		}
		
		
	}

}
