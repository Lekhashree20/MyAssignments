package week3.assignments;

public class ConcreteClassAutomation extends AbstractClassMultipleLanguage implements InterfaceLanguage,InterfaceTestTool
{

	public static void main(String[] args) {
		
		ConcreteClassAutomation obj = new ConcreteClassAutomation();
		obj.python();
		obj.java();
		obj.ruby();
		obj.selenium();

	}

	public void java() {

		System.out.println("Java Language");
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby Language");
		
	}

	public void selenium() {

		System.out.println("Welcome to the world of Selenium");
		
	}

}
