package Lesson2;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Application2 {

	public static void main(String[] args) {
		ArrayList<String> animal=new ArrayList<String>();
		animal.add("Tiger");
		animal.add("Dog");
		animal.add("Shark");
		animal.add("Lion");
		
		/*for(int i=0;i<animal.size();i++) {
			System.out.println(animal.get(i));//animal.size=4 so it become from 0 to <4 that is 3, so prints 0,1,2,3.Traversing method
			}
		*/
		
		LinkedList<Vehicle> vehicle=new LinkedList<Vehicle>();
		Vehicle vehicle1=new Vehicle("Maruti","Zen",120000);
		Vehicle vehicle2=new Vehicle("Jeep", "Comapass", 320000);
		vehicle.add(vehicle1);
		vehicle.add(vehicle2);
		vehicle.add(new Vehicle("Honda","Civic",260000));
	/*	for(Vehicle veh:vehicle) {
			System.out.println(veh.getMake());
			System.out.println(veh.getModel());
			System.out.println(veh.getPrice());//Traversing method to traverse using getters.
		}*/
	
		printList(vehicle);
		printList(animal);
	}
	public static void printList(List list) {
		for(int i=0;i<list.size();i++)//List includes both these types Linked as well as
			System.out.println(list.get(i));
	}

}
