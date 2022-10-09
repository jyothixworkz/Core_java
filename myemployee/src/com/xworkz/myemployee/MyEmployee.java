package com.xworkz.myemployee;

public class MyEmployee implements Comparable {
	private Integer id;
	private String name;

	public MyEmployee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Integer id = this.id;
		MyEmployee employee = (MyEmployee) o;
		Integer id2 = employee.id;
		if (id < id2) {
			return -1;
		} else if (id > id2) {
			return +1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "MyEmployee [id=" + id + ", name=" + name + "]";
	}

}
