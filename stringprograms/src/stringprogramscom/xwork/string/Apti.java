package stringprogramscom.xwork.string;

import java.util.stream.IntStream;

public class Apti {
	public static void main(String[] args) {

		String string = "hi   god ,is great                ";
		String[] split = string.split("[,]");
		// System.out.println(split[0]);
		char charAt = string.charAt(2);
		// System.out.println(charAt);
		IntStream chars = string.chars();
		// System.out.println(chars);
		int l = string.codePointAt(1);
		// System.out.println(l);
		int codePointBefore = string.codePointBefore(2);
		// System.out.println(codePointBefore);
		int codePointCount = string.codePointCount(0, 12);
		// System.out.println(codePointCount);
		IntStream codePoints = string.codePoints();
		// .out.println(codePoints);
		// System.out.println(string.indexOf("god"));
		// System.out.println(string.indexOf('h'));
		System.out.println(string.trim());
		System.out.println(string);

	}

}
