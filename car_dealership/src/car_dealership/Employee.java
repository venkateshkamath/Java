package car_dealership;

public class Employee {

 public void handleCustomer(Customer cust,Vehicle vehicle, boolean finance){
	double amount=vehicle.getPrice()-cust.getCashOnHand();
	if(finance==true) {
		runCreditHistory(cust,amount);
	}
	else if(vehicle.getPrice()<=cust.getCashOnHand()) {
		//customer gives cash on hand
		processTransaction(cust,vehicle);
			
		}
	else System.out.println("Please get some money" +cust);
	}
 
 public  void runCreditHistory(Customer cust,double amount){
	 System.out.println("This "+cust+" has enough amount");
	 System.out.println("This customer is approved for amount "+ amount);
 }
 public  void processTransaction(Customer cust, Vehicle vehicle) {
	 System.out.println("Thank you for purchasing a car"+cust );
	 System.out.println("A succesful purchase of "+vehicle +vehicle.getPrice());
 }
}
