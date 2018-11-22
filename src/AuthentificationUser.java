
public class AuthentificationUser extends User{

	AuthentificationUser(String username, String password) {
		super(username, password);
	}
	static boolean authentification(String username, String password) {
		boolean login = false;
		
		for(int i = 0; i < User.users.size(); i++) {
			if(username.equals(User.users.get(i).getUsername()) && password.equals(User.users.get(i).getPassword())) {
				login = true;
				actualUser = User.users.get(i);
				break;
			}
		}
		
		return login;
	}
}

