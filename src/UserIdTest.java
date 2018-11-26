import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserIdTest {

	@Test
	void test() {
		User user1 = new User("Andres", "andres@andrewshop.com", "qwerty", 3);
		user1.getId_user();
		System.out.println(user1.getId_user());
		user1.setId_user(5);
		System.out.println(user1.getId_user());
	}

}
