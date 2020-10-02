package car_dealership;

public class Delership {

	public static void main(String[] args) {
		Customer cust1=new Customer();
		cust1.setName("Jerry");
		cust1.setAddress("Info maniac street");
		cust1.setCashOnHand(12000);
		Employee emp=new Employee();
		
		
		Vehicle vehicle=new Vehicle("Honda",13000,"Accord");
	
		cust1.purchase(vehicle,emp, true);
		Vehicle car=new Vehicle("Honda",13000,"Accord");
		
	if(car.equals(vehicle)) {
	System.out.println(true);
	}
	else System.out.println(false); //checks the data iff the hash code and equals method is written in the Vehicle class else if not written checks for car and vehicle memory location
	//is same or not. Checks for all 3 fields
		}

	}


