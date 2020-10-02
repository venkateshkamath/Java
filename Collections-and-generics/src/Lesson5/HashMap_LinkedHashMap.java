package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class HashMap_LinkedHashMap {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Doctor", "a person who is qualified to treat people who are ill.");//.put is used to add elements in Map in form or oder of<key,value>.
		dictionary.put("Gate", "a hinged barrier used to close an opening in a wall, fence, or hedge.");
		dictionary.put("Confidence","the feeling or belief that one can have faith in or rely on someone or something");
		dictionary.put("Zeal", "great energy or enthusiasm in pursuit of a cause or an objective.");
		for(String key :dictionary.keySet()) {
			System.out.println(key);//Traverse method to go over keys.
		}
		for(String value: dictionary.values() ) {
			System.out.println(value);//Traversing method to print the  values of that key-set will be printed.
		}
		for(Map.Entry<String,String> together: dictionary.entrySet()) {
			System.out.print(together.getKey());//Prints only the Key.
			System.out.println(together.getValue());//Prints only the values. 
			System.out.println(together);//Single proper step to print both the keys and the values.
		}

	}

}
