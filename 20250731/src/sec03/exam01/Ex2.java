package sec03.exam01;

interface AA {
	void method();
}

class BB implements AA {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex2 {
	
	public static void main(String[] args) {
		AA a = new BB();
		
	}

}
