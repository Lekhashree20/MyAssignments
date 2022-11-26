package week3.assignments;

public class MethodOverridingAxisBank extends MethodOverridingBankInfo {

	public static void main(String[] args) {

		MethodOverridingAxisBank obj = new MethodOverridingAxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();

	}

	public void deposit() {

		System.out.println("Deposit from Axis bank");

	}

}
