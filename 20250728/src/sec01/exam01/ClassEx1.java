package sec01.exam01;

interface D {
	
}

class E implements D{}
class F implements D{}

class A {
	D d1 = new E();
	D d2 = new F();
}

class B{
	A a;
}

class C extends A {
	
}

public class ClassEx1 {
	public static void main(String[] args) {
		
	}
}
