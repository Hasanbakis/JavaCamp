package nLayered.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayered.dataAccess.abstracts.UserDao;
import nLayered.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	private List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated " + user.getFirstName());
		
	}




	@Override
	public List<User> getAll() {
		
		return users;
	}

}
