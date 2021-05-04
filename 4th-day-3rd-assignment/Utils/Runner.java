package Utils;

import Abstract.LoggerService;

public class Runner {
	
	public static void runLoggers(LoggerService[] loggerServices, String message) {
		for(LoggerService loggerService:loggerServices) {
			loggerService.log(message);
		}
		
	}
	
	

}
