package java_basics;

public class Array {

	public static void main(String[] args) {
		Var v1 = new Var();
		System.out.println(v1.a);
		int[] numbers=new int[100];
		numbers[0]=23;
		numbers[86]=56;
		numbers[60]=6;
		System.out.println(numbers[0]);
		System.out.println(numbers[99]);
		System.out.println(numbers[60]);
		System.out.println(numbers[86]);
	
		char[] symbols=new char[30];
		symbols[2]='$';
		symbols[25]='&';
		System.out.println(symbols[25]);
		System.out.println(symbols[20]);
		
		String[] array=new String[50];
		array[9]="Hi ";
		array[1]="My close";
		array[28]="Friend";
		System.out.println(array[0]);
	System.out.println(array[1]);

}}
class Var{
	int a=4;
}

