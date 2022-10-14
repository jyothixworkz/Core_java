package com.xworkz.comparator;

public class Employeee  implements Comparable {
private Integer id ;
private String name;
private Integer salary;
public Employeee(Integer id, String name, Integer salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employeee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public int compareTo(Object o) {
	
	 int id =this.id;
Employeee employeee	 =(Employeee)o;
	Integer id2 = employeee.id;
	if(id<id2)
		return -1;
	else if(id>id2)
		return +1;
	else
		return 0;
	
	
	//return 0;
}


	
	
	
	
	
	
}
