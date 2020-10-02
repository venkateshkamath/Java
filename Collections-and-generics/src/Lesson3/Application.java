package Lesson3;

import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<Animals> animal=new HashSet<Animals>();
		Animals animal1=new Animals("Lion",8);
		Animals animal2=new Animals("Dog",10);
		Animals animal3=new Animals("Cat",2);
		Animals animal4=new Animals("Dog",10);
		animal.add(animal1);
		animal.add(animal2);
		animal.add(animal3);
		animal.add(animal4);
		animal.add(new Animals("Tiger",6));//other method of declaring also counts.
		System.out.println(animal2.hashCode());
		System.out.println(animal4.hashCode());
		System.out.println(animal2.equals(animal4));//Comparing data of 2 using equals method take reference from Animals.java.
		for(Animals count:animal) {
			System.out.println(count);//Traversal Technique.
		}
		

	}

}
