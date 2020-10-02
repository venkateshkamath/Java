package Lesson4;

import java.util.HashSet;

public class AddAll_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> list1=new HashSet<Integer>();
		list1.add(23);
		list1.add(56);
		list1.add(1);
		list1.add(65);
		list1.add(12);
		list1.add(99);
		
		
		HashSet<Integer> list2=new HashSet<Integer>();
		list2.add(44);//There is no way of Duplication of elements.
		list2.add(8);
		list2.add(127);
		list1.addAll(list2);//Datas of list 2 is combined with the list1.addAll is used to concatenate.
		System.out.println(list1);
		list1.clear();/*Clear all the elements of list1.*/
	}

}
