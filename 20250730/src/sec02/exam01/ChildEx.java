package sec02.exam01;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;  //다형성을 사용
		parent.method1();
		parent.method2();
		
		Child child2 = (Child) parent;  //강제 형변환
		child2.method3();
	}

}
