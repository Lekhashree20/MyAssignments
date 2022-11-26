package week3.assignments;

public class MethodOverloadingStudent {

	public static void main(String[] args) {
		
		MethodOverloadingStudent obj = new MethodOverloadingStudent();
		obj.getStudentInfo(5002);
		obj.getStudentInfo(5002, "Lekhashree");
		obj.getStudentInfo("lekashree20@gmail.com",9840429017L);
		

	}

	public void getStudentInfo(int id) {
		
		System.out.println(id);

	}

	public void getStudentInfo(int id, String name) {
		
		System.out.println(id + name);

	}

	public void getStudentInfo(String email, long phoneNumber) {
		
		System.out.println(email + phoneNumber);

	}
}
