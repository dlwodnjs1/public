package sec01.exam03;

public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

	@Override
	void method1() {
		System.out.println(name + "Student");
		super.method1();
	}
	
	
}
