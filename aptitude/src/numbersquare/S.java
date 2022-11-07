package numbersquare;

public class S {

	static boolean per(Double value) {

		Double sqrt = Math.sqrt(value);
		Double floor = Math.floor(sqrt);
		if (sqrt.equals(floor)) {
			return true;
		}
return false;
		
	}
	public static void main(String[] args) {
		boolean per = per((double)49);
		System.out.println(per);
	}

}
