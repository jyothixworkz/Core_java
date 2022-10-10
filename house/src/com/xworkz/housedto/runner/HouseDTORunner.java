package com.xworkz.housedto.runner;

import com.xworkz.housedto.HouseDTO;
import static com.xworkz.house.type.Type.*;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.house.owningtype.OwningType;

import static com.xworkz.house.owningtype.OwningType.*;

import com.xworkz.house.type.Type;

public class HouseDTORunner {
	public static void main(String[] args) {
		HouseDTO dto = new HouseDTO(1, "balaji", "malathesh", Type.INDIVITUAL, 3, false, OwningType.OWN);
		HouseDTO dto1 = new HouseDTO(2, "sowmya", "manoj", Type.VILLA, 1, true, OwningType.LEASE);
		HouseDTO dto2 = new HouseDTO(3, "sangeetha", "manya", Type.APARTMENT, 2, false, OwningType.RENT);
		HouseDTO dto3 = new HouseDTO(4, "sowjanya", "varun", Type.INDIVITUAL, 3, false, OwningType.OWN);
		HouseDTO dto4 = new HouseDTO(5, "shantha", "raghu", Type.VILLA, 4, true, OwningType.LEASE);
		HouseDTO dto5 = new HouseDTO(6, "saratha", "sarath", Type.APARTMENT, 1, false, OwningType.RENT);

		HouseDTO dto6 = new HouseDTO(7, "balaji", "madhu", Type.INDIVITUAL, 2, true, OwningType.OWN);
		HouseDTO dto7 = new HouseDTO(8, "benki", "nandan", Type.VILLA, 5, true, OwningType.LEASE);
		HouseDTO dto8 = new HouseDTO(9, "balaya", "chandra", Type.APARTMENT, 2, false, OwningType.RENT);
		HouseDTO dto9 = new HouseDTO(10, "santha", "asha", Type.INDIVITUAL, 3, true, OwningType.OWN);
		HouseDTO dto10 = new HouseDTO(11, "shiva", "om", Type.VILLA, 1, false, OwningType.LEASE);
		HouseDTO dto11 = new HouseDTO(12, "geetha", "prajval", Type.APARTMENT, 2, false, OwningType.RENT);
		HouseDTO dto12 = new HouseDTO(13, "yaru", "shashidhar", Type.INDIVITUAL, 3, false, OwningType.OWN);
		HouseDTO dto13 = new HouseDTO(14, "ninu", "jaya", Type.VILLA, 3, true, OwningType.LEASE);
		HouseDTO dto14 = new HouseDTO(15, "nanu", "jyothi", Type.APARTMENT, 10, false, OwningType.RENT);
		HouseDTO dto15 = new HouseDTO(16, "hogelo", "jayanth", Type.INDIVITUAL, 15, true, OwningType.OWN);
		HouseDTO dto16 = new HouseDTO(17, "ba", "chandana", Type.VILLA, 12, false, OwningType.LEASE);
		HouseDTO dto17 = new HouseDTO(18, "bani", "chikku", Type.APARTMENT, 14, true, OwningType.RENT);
		HouseDTO dto18 = new HouseDTO(19, "hogi", "hanumanth", Type.VILLA, 10, false, OwningType.OWN);
		HouseDTO dto19 = new HouseDTO(20, "***", "choori", Type.INDIVITUAL, 14, true, OwningType.LEASE
				);
		 List<HouseDTO> list = new ArrayList<HouseDTO>();
		 list.add(dto);
		 list.add(dto1);
		 list.add(dto2);
		 list.add(dto3);
		 list.add(dto4);
		 list.add(dto5);
		 list.add(dto6);
		 list.add(dto7);
		 list.add(dto8);
		 list.add(dto9);
		 list.add(dto10);
		 list.add(dto11);
		 list.add(dto12);
		 list.add(dto13);
		 list.add(dto14);
		 list.add(dto15);
		 list.add(dto16);
		 list.add(dto17);
		 list.add(dto18);//0//+ve//-ve// 8  10 
		 list.add(dto19);
		 System.out.println("assending order id");
		 list.stream().sorted((ref,ref2)->ref.getId().compareTo(ref2.getId())).forEach((ref)->System.out.println(ref));
		 System.out.println("dissending order id");
		 list.stream().sorted((ref,ref2)->-ref.getId().compareTo(ref2.getId())).forEach((ref)->System.out.println(ref));
         System.out.println("assending order of name");
         list.stream().sorted((ref,ref2)->ref.getName().compareTo(ref2.getName())).forEach((ref)->System.out.println(ref));
      System.out.println("sort by dessending of type");
     
      list.stream().sorted((ref,ref1)->ref.getType().compareTo(ref1.getType())).forEach((ref)->System.out.println(ref));
      System.out.println("home dto with loan and sort by owner in dessending");
      list.stream().filter((ref)->ref.isLoan()==true).sorted((ref,ref1)->-ref.getOwner().compareTo(ref1.getOwner()))
      .forEach((ref)->System.out.println(ref));
      System.out.println("home without loan and sort by owner in dessending");
      list.stream().filter((ref)->ref.isLoan()==false).sorted((ref,ref1)->-ref.getOwner().compareTo(ref1.getOwner()))
      .forEach((ref)->System.out.println(ref));
      System.out.println("owning type is lease");
      list.stream().filter((ref)->ref.getOwningType()==ref.getOwningType().LEASE).forEach((ref)->System.out.println(ref));
      
      System.out.println("type is appartment");
      list.stream().filter((ref)->ref.getType()==ref.getType().APARTMENT).forEach((ref)->System.out.println(ref));
      System.out.println("type is villa");
      list.stream().filter((ref)->ref.getType()==ref.getType().VILLA).forEach((ref)->System.out.println(ref));
      System.out.println("sort by type and owning type");
      list.stream().sorted((ref,ref1)->{
    	  int compareTo = ref.getType().compareTo(ref1.getType());
    	  if(compareTo==0) {
    	return	 ref.getOwningType().compareTo(ref.getOwningType());
    	  }
    	  
    return compareTo;  
    }).forEach((ref)->System.out.println(ref));
      
      System.out.println("sort by name and id in dessinding");
    list.stream().sorted((ref,ref2)->{
    	int compareTo = ref.getName().compareTo(ref2.getName());
    	if(compareTo==0) {
    		return ref.getId().compareTo(ref.getId());
    	}
    	return compareTo;
    }).forEach((ref)->System.out.println(ref)); 
      
      
      }
	
	
	
	

}
