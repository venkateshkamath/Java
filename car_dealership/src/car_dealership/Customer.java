package car_dealership;

public class Customer {
	
private	String name;
private	String address;
private	double cashOnHand;



public String getName() {
	return name;
}
public void setName(String name){
	this.name=name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	address+="Dominic st.";
	this.address = address;
}
public double getCashOnHand() {
	return cashOnHand;
}
public void setCashOnHand(double cashOnHand) {
	
	this.cashOnHand = cashOnHand;
}
 public void purchase(Vehicle vehicle, Employee emp, boolean finance) {
	emp.handleCustomer(this, vehicle, finance);//this refers to instance of this class that is customer. Can't use cust.
	}
@Override
public String toString() {
	return "Customer [name=" + name + ", address=" + address + ", cashOnHand=" + cashOnHand + "]";
}

}
