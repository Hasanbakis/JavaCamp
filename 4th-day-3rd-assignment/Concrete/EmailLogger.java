package Concrete;

import Abstract.LoggerService;

public class EmailLogger implements LoggerService{
	
	@Override
	public void log(String message) {
		System.out.println( message+ " is logged to email ");
		
	}

}
