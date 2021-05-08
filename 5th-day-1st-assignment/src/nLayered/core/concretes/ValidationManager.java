package nLayered.core.concretes;

import java.util.regex.Pattern;

import nLayered.core.abstracts.ValidationService;
import nLayered.entities.concretes.User;

public class ValidationManager implements ValidationService{

	@Override
	public boolean checkName(User user) {
		if(user.getFirstName().length() <=2 && user.getLastName().length() <=2) {
			System.out.println("Name and surname must contain at least two characters.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}
		System.out.println("Password must be at least 6 characters.");
		return false;
	}

	
	
	@Override
	public boolean isEmailValid(User user) {
		Pattern mailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		if (mailRegex.matcher(user.getEmail()).find()) {
			return true;
		}
		System.out.println("E-mail address could not be verified");
		return false;
        
	}

	@Override
	public boolean isEmailConfirm(User user) {
		System.out.println("Please Enter the verification code which sent to the email!");
		System.out.println("Please Click the Link Below for Verification!");
		System.out.println("User Confirmed  : " + user.getFirstName() + " " + user.getLastName());
		return true;
		
	}

	
	

}
