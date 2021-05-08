package nLayered.business.concretes;

import java.util.List;

import nLayered.business.abstracts.UserService;
import nLayered.core.abstracts.AuthService;
import nLayered.core.abstracts.ValidationService;
import nLayered.dataAccess.abstracts.UserDao;
import nLayered.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private ValidationService validationService;
	private AuthService authService;

	public UserManager(UserDao userDao, ValidationService validationService,AuthService authService) {
		super();
		this.userDao = userDao;
		this.validationService = validationService;
		this.authService=authService;
	}

	@Override
	public void add(User user) {
		if(validationService.isEmailValid(user) && validationService.isEmailConfirm(user) &&
				validationService.checkName(user) && validationService.checkPassword(user)) {
			userDao.add(user);
			authService.register(user.getFirstName());
			
		}
		
	}

	@Override
	public void login(User user) {
		for(User users:this.getAll()) {
			if(users.getPassword()==user.getPassword() && users.getPassword()==user.getPassword()) {
				System.out.println("Login to the system has been successfully made");
			}else{
				System.out.println("Mail or password is incorrect");
			}
		}
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	
}
