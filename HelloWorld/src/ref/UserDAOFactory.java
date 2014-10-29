package ref;

public class UserDAOFactory {

	public static UserDAOImpl createUserDAOImpl() {
		return new UserDAOImpl();
	}

}
