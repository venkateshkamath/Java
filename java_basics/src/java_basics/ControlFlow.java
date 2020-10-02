package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry=true;
		if(hungry) {
			System.out.println("I am starving");
		}else {
			System.out.println("I am full");
		}

	
  int hungerRate=0;
	if(!(hungerRate>6))
	{
		System.out.println("Not hungry");
	}else if(hungerRate==6)
	{
		System.out.println("Really hungry");
	}else System.out.println("OK");//By using else if by default it printed the else case.3rd case.
	
	
	int favouritetemp=32;
	int currenttemp=35;
	String opinion;
	if(currenttemp==favouritetemp) {// if inside anothe if any no of times is allowed..
	if(currenttemp>favouritetemp+10) {
		opinion="Very cool day";
	}else if(currenttemp==favouritetemp) {
		opinion="I like it anyways";
	}else if(favouritetemp==currenttemp-10) {
		opinion="Still a cooler day";
	}
	else {     
		opinion="temp unknown";
	}
	
	System.out.println(opinion);
	}
	System.out.println("bad day");
	
	
	
	if(currenttemp>favouritetemp+10) {
		System.out.println("Very cool day");
	}else if(currenttemp==favouritetemp) {
		System.out.println("I like it anyways");
	}else if(favouritetemp==currenttemp-10) {
		System.out.println("Still a cooler day");
	}
	else {     
		System.out.println("temp unknown");//op printing statement can also be used but above one is very efficient when  thought of memory.But both are acceptable
	
	
	int month=8;
	String MonthName;
	switch(month) {
	
	case 1:MonthName="january";
	break;
	case 2:MonthName="february";
	break;
	case 3:MonthName="March";
	break;
	case 4:MonthName="april";
	break;
	case 5:MonthName="May";
	break;
	case 6:MonthName="june";
	break;
	default:MonthName="Not Valid";
	}
	System.out.println(MonthName);//So it is going to print by that variable MonthName as assigned.Switch checks here month variable with matching case 8 doesnt match any case number so not valid is printed here
	}
	

	}
	
	
}