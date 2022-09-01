package com.xworkz.objectclass;

public class HumanRunner {
	public static void main(String[] args) {
		Human human = new Human("manoj", "huligerepura");
		Human human2 = new Human("manoj", "huligerepura");
		Human human3=new Human("darshan", "chanpatna");
		System.out.println(human);
		System.out.println(human2);
		boolean B = human.equals(human2);
		System.out.println(B);
		boolean c =human.equals(human3);
		System.out.println(c);}

}
