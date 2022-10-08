package com.xworkz.indianstate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IndianState {
	public static void main(String[] args) {
		Collection<String> list = new ArrayList<String>();
		list.add("andhra pradesh");
		list.add("arunanchal pradesh");
		list.add("assam");
		list.add("bihar");
		list.add("chhattisgarh");
		list.add("goa");
		list.add("gujurat");
		list.add("haryana");
		list.add("himanchan pradesh");
		list.add("jammu and kashmir");
		list.add("jharkhand");
		list.add("karnataka");
		list.add("kerala");
		list.add("madhya pradesh");
		list.add("manipur");
		list.add("maharastra");
		list.add("meghalaya");
		list.add("mizoram");
		list.add("nagaland");
		list.add("adisha");
		list.add("punjab");
		list.add("rajasthan");
		list.add("sikkim");
		list.add("tamil nadu");
		list.add("telangana");
		list.add("tripura");
		list.add("uttar pradesh");
		list.add("andhra pradesh");
		list.add("uttarakhand");
		list.add("west bengal");
		System.out.println(list);
		System.out.println("=============================");
		list.stream().filter((ref) -> ref.endsWith("a")).forEach((ref) -> System.out.println(ref));
		System.out.println("=================================");
		list.stream().filter((ref) -> ref.startsWith("k")).forEach((ref) -> System.out.println(ref));
		System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
		list.stream().filter((ref) -> ref.contains("l")).forEach((ref) -> System.out.println(ref));
		System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
		list.stream().filter((ref) -> ref.contains("d")).forEach((ref) -> System.out.println(ref));
		System.out.println("😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘😘");
		list.stream().filter((ref) -> ref.contains("r")).forEach((ref) -> System.out.println(ref));
		System.out.println("🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌🙌");
		list.stream().filter((ref) -> ref.contains("h")).forEach((ref) -> System.out.println(ref));
		System.out.println("😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜😜");
		list.stream().filter((ref) -> ref.length() > 10).forEach((ref) -> System.out.println(ref));
		System.out.println("💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖");
		list.stream().filter((ref) -> ref.length() < 5).forEach((ref) -> System.out.println(ref));
		System.out.println(
				"🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️🤷‍♂️");
		list.stream().forEach((ref) -> System.out.println(ref.toUpperCase()));
		System.out.println("🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️");
		list.stream().forEach((ref) -> System.out.println(ref.toLowerCase()));
		System.out.println(
				"🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️");
		list.stream().forEach((ref) -> {
			StringBuilder builder = new StringBuilder();
			builder.append(ref);
			System.out.println(builder.reverse());

		});
		System.out.println(
				"🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️🤷‍♀️");
		list.stream().forEach((ref) -> {
			char[] a = ref.toCharArray();
			int count;
			for (int i = 0; i < ref.length(); i++) {
				count = 1;
				for (int j = 0 + i; j < ref.length(); j++) {
					if (a[i] == a[j] && a[i] != ' ') {
						count++;
						a[j] = 0;
						System.out.println(a[i]);

					}

				}
				if (count > 1 && a[i] != '0') {
					System.out.println(a[i]);
				}

			}

	});

	}

}
