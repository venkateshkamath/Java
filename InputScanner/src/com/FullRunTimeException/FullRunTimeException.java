package com.FullRunTimeException;

public class FullRunTimeException extends Exception{
	public FullRunTimeException(String message) {
		super(message);//created an own full run time exception that is a child of exception using inheritance. Constructor should be same name as class name.
	}
}
