package nLayered;
import nLayered.business.concretes.UserManager;
import nLayered.core.concretes.GoogleAuthManagerAdapter;
import nLayered.core.concretes.ValidationManager;
import nLayered.dataAccess.concretes.HibernateUserDao;
import nLayered.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Hasan","Bakis","hasanbakis@gmail.com","1231451");
		User user2 = new User(2,"Mehmet","Davut","mehmodavut@gmail.com","1232112");
		User user3= new User(3, "Omer", "Yildiz", "omeryildiz@gmail.com", "1355464");
		UserManager userManager = new UserManager(new HibernateUserDao(), new ValidationManager(),new GoogleAuthManagerAdapter());

	   userManager.add(user);
	   userManager.login(user3);
	   
	   
	   //User list
	    for (User  users: userManager.getAll()) {
			System.out.println(users.getFirstName()+" "+users.getLastName());
		}
	}

}
