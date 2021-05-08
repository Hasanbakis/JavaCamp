package nLayered.dataAccess.abstracts;

import java.util.List;

import nLayered.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	List <User> getAll();

}
