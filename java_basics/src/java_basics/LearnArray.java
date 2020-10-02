package java_basics;

public class LearnArray {

	public static void main(String[] args) {
		int[] values=new int[100];//values is a variable of int datatype array represented by int[], new is memory allocation to integer and size mentioning

		values[0]=208;
		values[29]=32568;
		values[10]=45;			//Storing values into the arrays
		System.out.println(values[29]);
		
		
		String[] words=new String[] {"Venkatesh","is","My","name"};// String array.1st method
		
		System.out.println(words[2]);
		System.out.println(words[3]);
		System.out.println(words[1]);
		System.out.println(words[0]);	
		String[] type2=new String[5];//2nd method.
		
		type2[0]="Raj";
		type2[1]="Mera";
		type2[2]="Nam";
		type2[3]="hey";
		System.out.println(type2[1]);
		System.out.println(type2[2]);
		System.out.println(type2[3]);
		System.out.println(type2[0]);//preferred like integer.
		
		
		words=new String[10];
		words[2]="Rajashekhar";//Re declared
		System.out.println(words[2]);//once ame new variable is created it wont have same thing must re-declare
		System.out.println(words[5]);
	
	
	
	

}}
