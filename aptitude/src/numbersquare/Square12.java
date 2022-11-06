package numbersquare;

import java.util.Scanner;

import com.xworkz.aptitude.star.S;

public class Square12 {
	static boolean sq(Double value) {

		double sqrt = Math.sqrt(value);
		double floor = Math.floor(sqrt);
		Double double1 = sqrt - floor;
		if(double1==0) {
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println(" enter the num");
	double nextDouble = scanner.nextDouble();
	boolean sq = sq(nextDouble);
	System.out.println(sq);
}
}
