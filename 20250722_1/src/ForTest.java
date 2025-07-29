
public class ForTest {
	public static void main(String[] args) {
		int sum = 0;
		
//		for (int i = 0; i < 10; i++) {
//			sum = sum + i;
//		}
		
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
	
		
		System.out.printf("합계: %d\n", sum);
		
	}
}
