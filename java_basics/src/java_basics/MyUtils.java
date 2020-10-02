package java_basics;

public class MyUtils {

	public static void printsomething(String argument) {
		System.out.println(argument);//appending now argument holds the data written in the parenthesis of the main method.
		
	}//defining a method ourselves.

	public static void printsomething(int argument) {
		System.out.println("Integer passed is "+ argument);//for integers the parenthesis of the method must be having datatype integer.
		
}
	
	public static void printsomething(double argument) {
		System.out.println("Decimal passed is "+ argument);//for integers the parenthesis of the method must be having datatype double.
		
}
	public static void add2nos(int first,int second) {
		System.out.println(first+second);
	}
	public static int add10(int ten) {
		int result;
		result=ten+10;
		return result;
	}//void doesn't return anything so public static int.
		public static String sentence(String argum) {
			return argum;
			
	}
		public static int addfifty(int argfifty) {
			int res=(argfifty+50);//Making it private will give an error in other class
			return res;
		}
		public void add100(int argument){
			int answer=100+argument;
			System.out.println(answer);
		}
}

