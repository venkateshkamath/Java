package Lesson4;

import java.util.HashSet;

public class Retain_All {

	public static void main(String[] args) {
		HashSet<Double> list1 =new HashSet<Double>();
		list1.add(23.23);
		list1.add(10.01);
		list1.add(88.0);
		list1.add(46.46);
		list1.add(29.11);
	
		HashSet<Double> newlist =new HashSet<Double>();
		newlist.add(46.46);
		newlist.add(29.11);
		newlist.add(3.3);
		list1.retainAll(newlist);// It retains the elements of newlist and deletes the rest easily.
		System.out.println(list1);
		//list1.clear();The list1 got cleared.
		boolean check=list1.isEmpty();//Checks whether list1 is empty or not.
		System.out.println(check);
		boolean hasValue1=list1.contains(55.55);
		boolean hasValue2=newlist.contains(3.3);
		System.out.println(hasValue1);
		System.out.println(hasValue2); 
		

	}

}
