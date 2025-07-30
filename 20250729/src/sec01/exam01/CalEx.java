package sec01.exam01;

public class CalEx {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
//		calculator.x = 7;
//		calculator.y = 10;
		calculator.setX(-7);
		calculator.setY(10);
		calculator.execute();
	}

}
