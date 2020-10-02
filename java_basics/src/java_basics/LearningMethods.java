package java_basics;

import SomeotherPackage.Example;

public class LearningMethods {

	public static void main(String[] args) {
		System.out.println("Hi,my name is Venkatesh");//Caused because of inbuilt libraries
	MyUtils.printsomething("llama");//printsomething is a method of class MyUtils.
	MyUtils.add2nos(20,30);
	int var=MyUtils.add10(20);
	System.out.println(var);
	String words=MyUtils.sentence("Robin");//It has only captured not printed
	System.out.println(words);//Now it is printed
	MyUtils.addfifty(25);//shows an error cause in other class it is private so it cannot be accessed over here. Can be accessed only if it is public.
	Example.print();
	Example.dosomething();//This is got from other package example class
	MyUtils myVar;	//static is important for accessing from other class. This shows creation of an instance of that class that is a substitute for static.
	
	myVar=new MyUtils();//datas of MyUtils should come to myVar.assigning.
	myVar.add100(200);//successfully created an instance.Only in case static is not there. 
	
	}


	
}