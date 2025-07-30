package sec02.exam01;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	
	public boolean roll() {
		++accuumlatedRotation;
		if(accuumlatedRotation<maxRotation) {
			System.out.println(location + "HankookTire 수명: " +
				(maxRotation-accuumlatedRotation) + "회");
		return true;
		} else {
			System.out.println("***" + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
