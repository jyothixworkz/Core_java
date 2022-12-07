package com.xworkz.indianstate;

import java.util.function.Function;
import java.util.function.Predicate;

public class Manoj {
	public static void main(String[] args) {
		System.out.println("manoj");
		
		Function<Integer, Integer> function=i->i*i;
		System.out.println(function.apply(20));
		Predicate<Integer> predicate=i->i%2==0;
		System.out.println(predicate.test(25));
		Manoj1 manoj1=(a,b)->System.out.println("ba maga"+(a+b));
		manoj1.add(10,20);
	}

}
