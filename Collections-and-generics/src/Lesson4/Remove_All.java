package Lesson4;

import java.util.HashSet;

public class Remove_All {

	public static void main(String[] args) {
		HashSet<String> words= new HashSet<String>();
		words.add("Random");
		words.add("words");
		words.add("like");
		words.add("Java");
		words.add("Computers");
		words.add("Bullets");
		
		HashSet<String> new_words= new HashSet<String>();
		new_words.add("Computers");
		new_words.add("Bullets");
		new_words.add("Java");
		new_words.add("like");
		words.removeAll(new_words);//This goes to words and removes the things that are in new_words.
		System.out.println(words);

	}

}
