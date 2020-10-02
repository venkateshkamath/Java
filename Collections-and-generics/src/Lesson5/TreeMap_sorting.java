package Lesson5;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_sorting {

	public static void main(String[] args) {
		TreeMap<Integer,String> directory = new TreeMap<Integer,String>();
		directory.put(2984838, "Jonathan");
		directory.put(9485445, "Daisy");
		directory.put(4585, "Ajay");
		directory.put(45457885, "Kishore");
	//	directory.put(4585, "ABC");// This statement overwrites the previous statements.
		for(Map.Entry<Integer , String> sortTree : directory.entrySet()) {
			System.out.println(sortTree.getKey());//TreeMap is used to sort the things based on key value. Here it is Integer so it gives value corresponding to sorted Integer Key value.
			System.out.println(sortTree.getValue());//TreeMap is mainly used to sort the HashSet variants.
			System.out.println(sortTree);// Prints in the format Key = Value format easy format.
			
		}
	/*for(Integer number : directory.keySet()) {
		System.out.println(number);
	}
	for(String word:directory.values()) {
		System.out.println(word);
	}*/
		
	}

}
