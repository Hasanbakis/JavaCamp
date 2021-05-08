package nLayered.business.abstracts;

import java.util.List;

import nLayered.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();


}
