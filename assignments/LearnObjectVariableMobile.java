package week1.assignments;

public class LearnObjectVariableMobile {
	
	String mobileBrandName = "Oneplus7t";
	char mobileLogo = '1';
	short noOfMobilePiece = 1;
	int modelNumber = 7;
	long mobileImeiNumber = 123456789011111L;
	float mobilePrice = 300000;
	boolean isDamaged = false;

	public static void main(String[] args) {
		
		LearnObjectVariableMobile myMobile = new LearnObjectVariableMobile();
		System.out.println(myMobile.mobileBrandName);
		System.out.println(myMobile.mobileLogo);
		System.out.println(myMobile.noOfMobilePiece);
		System.out.println(myMobile.modelNumber);
		System.out.println(myMobile.mobileImeiNumber);
		System.out.println(myMobile.mobilePrice);
		System.out.println(myMobile.isDamaged);
		

	}

}
