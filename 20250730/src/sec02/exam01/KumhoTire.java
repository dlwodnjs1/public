package sec02.exam01;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	
	public boolean roll() {
		++accuumlatedRotation;
		if(accuumlatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire 수명: " +
				(maxRotation-accuumlatedRotation) + "회");
		return true;
		} else {
			System.out.println("***" + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}