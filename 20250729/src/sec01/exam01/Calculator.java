package sec01.exam01;

public class Calculator {
	
	
	void method(int y, int z) {}
	int method(int x) {return 0;}
	
	int x, y;
	
	public Calculator () {}
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		if(x < 0) {
		this.x = x;
		return;
	}
		this.x = x;
}

	public void setY(int y) {
		this.y = y;
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
