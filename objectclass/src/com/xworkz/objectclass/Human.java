package com.xworkz.objectclass;

public class Human {
	private String name;
	private String location;

	public Human(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", location=" + location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Human) {
				System.out.println("obj is the type of human");
				Human converHuman = (Human) obj;
				String convertName = converHuman.name;
			String convertLocation= converHuman.location;
				if (this.name.equals(convertName) && this.location.equals(convertLocation)) {
					System.out.println("obj is same");
					return this.name.equals(convertName) && this.location.equals(convertLocation);
				} else {
					System.out.println("obj is not equals");
				}
			} else {
				System.out.println("obj is not a type of human");
			}
		} else {
			System.out.println("obj is null");
		}
		return super.equals(obj);
	}
}
