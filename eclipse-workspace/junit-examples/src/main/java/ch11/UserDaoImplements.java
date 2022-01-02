package ch11;

public class UserDaoImplements implements UserDao {

	@Override
	public User find(String userId) throws UserNotFoundException {
		
		return new User();
		
	}

}
