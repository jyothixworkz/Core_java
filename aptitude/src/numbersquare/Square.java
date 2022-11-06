package numbersquare;

import java.util.Scanner;

public class Square {
	public static boolean square(Double value) {

		double sqrt = Math.sqrt(value);
		System.out.println("sqrt:"+sqrt);
		double floor = Math.floor(sqrt);
	System.out.println("floor"+floor);
		Double double1 = floor - sqrt;
		System.out.println("double:"+double1);
		

		if (double1 == 0) {
			return true;
		}
		return false;

	}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter the num");
		 double nextDouble = scanner.nextDouble();
		 boolean square = square(nextDouble);
		 if(square) {
			 System.out.println(" given number is square");
		 }
		 else {
			 System.out.println("no");
		 }
	}

}
