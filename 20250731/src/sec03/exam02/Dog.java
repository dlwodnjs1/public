package sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류"; //상속 개념
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
