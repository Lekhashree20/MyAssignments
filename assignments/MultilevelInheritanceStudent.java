package week3.assignments;

public class MultilevelInheritanceStudent extends MultilevelInheritanceDepartment{
	
	public static void main(String[] args) {
		
		//Multilevel Inheritance student class extends Department class, which in turn extends College
		
		MultilevelInheritanceStudent obj = new MultilevelInheritanceStudent();
		
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.deptName();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		
		
		
	}

	private void studentName() {

		System.out.println("Student name is Lekhashree");

	}

	private void studentDept() {

		System.out.println("Student Department is ICE");

	}

	private void studentId() {

		System.out.println("Student ID is 3000");

	}

}
