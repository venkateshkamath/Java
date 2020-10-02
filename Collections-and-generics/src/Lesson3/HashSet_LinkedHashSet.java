package Lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class HashSet_LinkedHashSet {

	public static void main(String[] args) {
			HashSet<Integer> numbers=new HashSet<Integer>();
			numbers.add(99);
			numbers.add(25);
			numbers.add(66);//HashSet only checks for the repeat and does not give importance to the order of the data.
			numbers.add(25);

			for(Integer start:numbers) {
				System.out.println(start);
			}
			LinkedHashSet<String> word=new LinkedHashSet<String>();
			word.add("Good");
			word.add("Morning");
			word.add("Are you..?");//LinkedHashSet not only checks for the repeat but also gives importance to the order of the data.
			numbers.add(25);
			word.add("Good");
			for(String start:word) {
				System.out.println(start);
			}
	}

}
