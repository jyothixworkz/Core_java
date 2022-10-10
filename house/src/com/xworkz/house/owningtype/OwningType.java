package com.xworkz.house.owningtype;

public enum OwningType {
	RENT("rent"),LEASE("lease"),OWN("own");
  private String type;
	OwningType(String string) {
		this.type=string;
		// TODO Auto-generated constructor stub
	}
	 public String getType() {
		return type;
	}

}
