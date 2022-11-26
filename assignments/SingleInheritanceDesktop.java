package week3.assignments;

public class SingleInheritanceDesktop extends SingleInheritanceComputer {

	//Single Inheritance - Desktop is child class and Computer is Parent class
	
	public static void main(String[] args) {

		SingleInheritanceDesktop obj = new SingleInheritanceDesktop();
		obj.computerMode();
		obj.desktopSize();

	}

	public void desktopSize() {

		System.out.println("Displaying the Desktop Size");

	}

}
