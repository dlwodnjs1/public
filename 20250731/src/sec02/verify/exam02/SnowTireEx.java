package sec02.verify.exam02;

public class SnowTireEx {

	public static void main(String[] args) {
//		SnowTire snowTire1 = (SnowTire) new Tire();
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		snowTire.run();
		tire.run();
	}

}
