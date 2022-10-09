package com.xworkz.xworkzodc;

public class XWorkzOdc implements Comparable {
	private Integer id;
	private String name;
	public XWorkzOdc(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "XWorkzOdc [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		Integer I=this.id;
		XWorkzOdc odc=(XWorkzOdc)o;
		Integer id2 = odc.id;
		if(id2<I)
			return +1;
		else if(id2>I)
			return -1;
		else
			return 0;
		
		//return 0;
	}

}
