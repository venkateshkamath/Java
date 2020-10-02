 package com.venkatesh.oldfileprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java7fileReading {

	public static void main(String[] args) {
		File file=new File("filenamechanged.txt");
		
		try(FileReader fileReader=new FileReader(file);
				BufferedReader bufferedReader=new BufferedReader(fileReader);) {
			
			String line=bufferedReader.readLine();
			while(line!=null) {
				System.out.println(line);
				line=bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Not found");//this is the latest method which implements Autocloseable(interface) so need not close.
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
