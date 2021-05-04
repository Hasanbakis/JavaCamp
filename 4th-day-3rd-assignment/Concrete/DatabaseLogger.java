package Concrete;

import Abstract.LoggerService;

public class DatabaseLogger implements LoggerService{

	@Override
	public void log(String message) {
    System.out.println( message + " is logged to database" );
		
	}

}
