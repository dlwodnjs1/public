package sec01.exam01;

public class Exception4 {
	
	public static void check(int weight) {
		if(weight > 100) {
			throw new MyExcepion("과체중입니다");
		}
	}
	
	public static void main(String[] args) {
	}

}
