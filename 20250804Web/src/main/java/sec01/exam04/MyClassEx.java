package sec01.exam04;

public class MyClassEx {

	public static void main(String[] args) {
		System.out.println("1)------------------");  // rc는 TV
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)------------------");  // Audio
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)------------------");  // Audio
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)------------------");  // TV
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());



	}

}
