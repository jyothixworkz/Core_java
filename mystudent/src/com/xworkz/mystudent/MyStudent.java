package com.xworkz.mystudent;

public class MyStudent implements Comparable {
	private int id;
	private String name;
	public MyStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyStudent [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		int id=this.id;
		MyStudent myStudent=(MyStudent)o;
		int id2 = myStudent.id;
		if(id<id2) {
			return -1;
		}
		else if(id>id2){
			return +1;
			
		}
		else {
			return 0;
		}
	//	return 0;
	}
	

}
