package com.venkatesh.oldfileprocessing;
import java.io.*;
public class FileProcessing_oldway {

	public static void main(String[] args) {
		
		File file=new File("filenamechanged.txt");//Scanner input=new Scanner(file);  ->Latest method of reading file.Now,
		BufferedReader bufferedReader = null;
		FileReader fileReader=null;
		try {
			fileReader=new FileReader(file);//Reads the file line by line.		 
		 bufferedReader= new BufferedReader(fileReader);// Should be written along with the FileReader to buffer/read each line. Reads line by line.
		String line=bufferedReader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=bufferedReader.readLine();//reads the next line and stores it in variable line.
		}
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");//Executed when file not found.
			//e.printStackTrace();
		} catch (IOException o) {
			System.out.println("There is some error in "+file.getName());//Executed when there is some IO error.
			//e.printStackTrace();
		}
		finally {
			try { 
				if(bufferedReader!=null) {
				bufferedReader.close();
				}
				if(fileReader!=null) {
					fileReader.close();
					
				}
			} 
			catch (IOException s) {
				
				s.printStackTrace();
			}//This will get executed at any cost.
		}
	}

}
