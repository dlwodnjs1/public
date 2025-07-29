package sec01.exam01;

public enum Season {
	SPIRNG("봄", 1), SUMMER("여름",2), FALL("가을", 3), WINTER("겨울", 4);
	
	String name;
	int temp;
	
//	season() {}
	
	season(String name; int temp) {
		this.name = name;
		this.temp = temp;
	}

}
