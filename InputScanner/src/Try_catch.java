import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Try_catch {

	public static void main(String[] args)  {
		try {
			File myfile=new File("filenamechanged.txt");	
		Scanner	input = new Scanner(myfile);//instance created to read the data, but data is not read.
			while(input.hasNextLine()) {
				String sentence=input.nextLine();//Reads data from the file.
				System.out.println(sentence);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");  //Checks whether file is available or not, in this case file is not available.
			//e.printStackTrace();
		}
		
		MyUtils myutils=new MyUtils();
		try {
			int res=myutils.subtract10(8);//In this case 8 is less than 10 so it goes to catch and prints an exception.
			System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
