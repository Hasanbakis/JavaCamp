package nLayered.core.abstracts;

import nLayered.entities.concretes.User;

public interface ValidationService {
	boolean checkName(User user);
	boolean checkPassword(User user);
	boolean isEmailValid(User user);
	boolean isEmailConfirm(User user);

}
