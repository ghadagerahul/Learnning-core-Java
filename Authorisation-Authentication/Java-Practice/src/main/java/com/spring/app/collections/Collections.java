package com.spring.app.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collections {

	public static void main(String[] args) {

		List<EmpEntity> empList = new ArrayList<>();

		empList.add(new EmpEntity(1, "Rahul", "pune", Integer.parseInt("9370005"), new Date(13 - 10 - 1999)));
		empList.add(new EmpEntity(2, "Vishwas", "wakad", Integer.parseInt("9172018"), new Date(18 - 07 - 1998)));
		empList.add(new EmpEntity(3, "Avinash", "KarveNagar", Integer.parseInt("9408082"), new Date(03 - 11 - 1996)));

		// empList.stream(Comparator.comparing(EmpEntity::getId));

		List<EmpEntity> list = empList.stream().sorted(Comparator.comparing(EmpEntity::getId))
				.collect(Collectors.toList());
		System.out.println(list);
		
		
		List list2 = new ArrayList<>();
		list2.add("wer");
		list2.add(123);
		
		List list1 = new LinkedList<>();
		list1.add("sdf");
		list1.add(123);
	}

}
