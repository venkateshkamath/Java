import java.util.ArrayList;

public class Collections_ArrayList {

	public static void main(String[] args) {
		ArrayList general=new ArrayList();
		general.add("Good");
		general.add("Morning");//used to add the data into the array.
		//general.remove(0);//Remove the data from the array, using index.
	
		general.add(12);
		general.add(30);
		general.add(27.999);		
		
		//Making the data-type of the variable to Object.
		Object item3= general.get(2);// Cannot be used for any operations.
		Object item4=general.get(3);
		// Error Object cannot be used for operation System.out.println(item4+item3);
		//Object converted to String and Stored in the String.
				String item1=(String) general.get(1);
				String item2=(String)general.get(0);
				//Adding integer using casting Object to integer and then using. 
		int item5=(int)general.get(2);
		int item6=(int)general.get(3);
		System.out.println(item5+item6);
		System.out.println(item4);//Printed using Objects...***
	} 

}
