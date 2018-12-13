import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AuthentificationUserTest {

	
	@Test
	void test() {
		//User user1 = new User("Andres", "andres@andrewshop.com", "qwerty", 0001);
		
		AuthentificationUser a1 = new AuthentificationUser("Andres","qwerty");
		
		a1.authentification("Andres", "qwerty");
		
		
	}

}
