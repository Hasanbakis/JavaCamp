package nLayered.core.concretes;

import nLayered.core.abstracts.AuthService;
import nLayered.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	
	@Override
	public void register(String message) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.registerWithGoogle(message);
		
	}

		

}
