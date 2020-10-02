package Lesson4;

import java.util.*;

public class HashSet_Sorting {

	public static void main(String[] args) {
		HashSet<Integer> sort= new HashSet<Integer>();
		sort.add(11);
		sort.add(46);
		sort.add(16);
		sort.add(55);
		sort.add(128);
		sort.add(14);
		ArrayList <Integer> sorting =new ArrayList<Integer>(sort);//pass the sort here so they are linked.
		Collections.sort(sorting);//Collections can be used only in List and not in hash set, so it is important to convert HashSet to List.
		System.out.println(sorting);
		LinkedHashSet<String> strings=new LinkedHashSet<String>();
		strings.add("I");
		strings.add("Like");
		strings.add("Java");
		strings.add("Programming");
		ArrayList<String> newVar=new ArrayList<String>(strings);
		Collections.sort(newVar);
		System.out.println(newVar);
	}

}
