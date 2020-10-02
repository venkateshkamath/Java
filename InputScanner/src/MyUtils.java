import com.FullRunTimeException.FullRunTimeException;

public class MyUtils {
	public int subtract10(int number)throws FullRunTimeException {
		if(number<10) {
			throw new  FullRunTimeException("Number less then 10"); 
		}
		return number-10;
	}
	
	
}