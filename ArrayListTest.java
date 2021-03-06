package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(10);
		list1.add(8);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(10);
		
		int first = list1.get(0);
		int last =list1.get(list1.size()-1);
		System.out.println(first + " " + last);
		//Print common values
		list1.retainAll(list2);
		
		System.out.println(list1);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(5);
		list3.add(8);
		list3.add(8);
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(5);
		list4.add(6);
		list4.add(10);
		
		//Remove duplicate
		List<Integer> newList =list3.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newList);

	}

}
