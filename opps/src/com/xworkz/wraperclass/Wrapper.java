package com.xworkz.wraperclass;

public class Wrapper {
	public static void main(String[] args) {
		Byte byte1 = new Byte((byte) 1);
		System.out.println(byte1);
		Byte byte2 = new Byte("1");
		System.out.println(byte2);
		Short short1 = new Short((short) 10);
		System.out.println(short1);
		Short short2 = new Short("10");
		System.out.println(short2);
		Integer integer = new Integer(10);
		System.out.println(integer);
		Integer integer1 = new Integer("10");
		System.out.println(integer1);
		Long long1 = new Long(10l);
		System.out.println(long1);
		Long long2 = new Long("10");
		System.out.println(long2);
		Float float1 = new Float(10.00f);
		System.out.println(float1);
		Float float2 = new Float(10.00);
		System.out.println(float2);
		Float float3 = new Float("10.00f");
		System.out.println(float3);
		Float float4 = new Float("10.00");
		System.out.println(float4);
		Double double1 = new Double(10.000);
		System.out.println(double1);
		Double double2 = new Double("10.00");
		System.out.println(double2);
		Character character = new Character('a');
		System.out.println(character);
  String m= "10";
  int parseInt = Integer.parseInt(m);
  System.out.println(parseInt);
	}

}
