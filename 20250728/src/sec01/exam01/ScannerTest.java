package sec01.exam01;

import java.util.Scanner;

public class ScannerTest {
	
	void method2() {}
	static String str;
	static void method(Scanner scan) {
		System.out.print("입력>");
		str = scan.nextLine();
//		method2();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ScannerTest.method(scan);
		System.out.println(str);
//		ScannerTest sct = new ScannerTest();
//		sct.method(scan);
//		System.out.println(sct.str);
	}
}
