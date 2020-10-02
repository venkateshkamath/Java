package com.venkatesh.oldfileprocessing;
class MyClass implements AutoCloseable{
	public void close() throws Exception{
		System.out.println("Closing");
	}
}
public class Application20 {

	public static void main(String[] args) {
		try(MyClass var=new MyClass();){
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	
			
		}
	
}
