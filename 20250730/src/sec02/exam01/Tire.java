package sec02.exam01;

public class Tire {
	
	public int maxRotation;  // 타이어의 수명: 최대 회전 수
	public int accuumlatedRotation;  // 누적 회전수
	public String location;  // 타이어의 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	
	public boolean roll() {
		++accuumlatedRotation;
		if(accuumlatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명: " +
				(maxRotation-accuumlatedRotation) + "회");
		return true;
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
