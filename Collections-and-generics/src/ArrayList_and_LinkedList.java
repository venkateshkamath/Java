import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayList_and_LinkedList {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();//Receives data of particular type. Here String.
		words.add("Good Morning");
		words.add("How are you..?");
		words.add("Hello");//Same as the previous class but efficient.
	/*	System.out.println(words.get(2));
		System.out.println(words.get(1));// Prints at that particular index.
		*/
		words.remove(1);//Rest of the elements shift one position left.
		words.add("gandu");
		for(String word  :  words) {
			System.out.println(word);//To print everything. That is go from 0 to n-1;
		}
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(70);
		numbers.add(700);
		numbers.add(56);
		numbers.add(23);
		numbers.remove(1);//removes element/data at position 1.
		numbers.add(59);
		numbers.remove(2);//Removed data at the present 2nd spot. Node shifts left.
		for(int n:numbers) {
			System.out.println(n);
		}
	}

}
