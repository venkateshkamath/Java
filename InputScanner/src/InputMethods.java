import java.util.Scanner;
public class InputMethods {

	public static void main(String[] args) {
		System.out.println("Enter some random texts :");
		Scanner input=new Scanner(System.in);
		String enteredtext=input.nextLine();
		System.out.println(enteredtext);
		 ForLoopInput();
	}
//For for loop;
	public static void ForLoopInput() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Enter the numbers");
			Scanner number = new Scanner(System.in);
			int enterednumber = number.nextInt();
			System.out.println(enterednumber);
		}
	}
}