package sec03.exam01;

abstract class A {  // 추상클래스는 객체 생성 못함
	abstract void method(); // 추상 메소드
}

class B extends A {
	
}

public class Ex1 {

	public static void main(String[] args) {
		A a = new B();
	}

}
