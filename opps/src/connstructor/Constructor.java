package connstructor;

import com.xworkz.opps.type.C;

public class Constructor {

	static int count = 0;
	{

		count++;
	}

	public Constructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	Constructor(int i) {

	}

	Constructor(double d) {

	}

	public static void main(String[] args) {
		System.out.println(count+"  manoj");
		Constructor constructor = new Constructor();
		Constructor constructor2 = new Constructor(10);

		Constructor constructor3 = new Constructor(10.00);
		System.out.println(constructor2.count);
		System.out.println(constructor.count);
		System.out.println(constructor3.count);

		System.out.println(count);
	}

	@Override
	public String toString() {
		return "Constructor []";
	}

}
