package sec03.exam3;

public class Dog implements Animal {

	public String kind;
	
	public Dog() {
		this.kind = "포유류";
	}
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	
}
