package com.xworkz.housedto;

import com.xworkz.house.owningtype.OwningType;
import com.xworkz.house.type.Type;

public class HouseDTO {
	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", type=" + type + ", onOfFloors="
				+ onOfFloors + ", loan=" + loan + ", owningType=" + owningType + "]";
	}
	public HouseDTO(Integer id, String name, String owner, Type type, Integer onOfFloors, boolean loan,
			OwningType owningType) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.onOfFloors = onOfFloors;
		this.loan = loan;
		this.owningType = owningType;
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
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Integer getOnOfFloors() {
		return onOfFloors;
	}
	public void setOnOfFloors(Integer onOfFloors) {
		this.onOfFloors = onOfFloors;
	}
	public boolean isLoan() {
		return loan;
	}
	public void setLoan(boolean loan) {
		this.loan = loan;
	}
	public OwningType getOwningType() {
		return owningType;
	}
	public void setOwningType(OwningType owningType) {
		this.owningType = owningType;
	}
	private Integer id;
	private String name;
	private String owner;
	private Type type;
	private Integer onOfFloors;
	private boolean loan;
	private OwningType owningType;
	
	
	
	

}
