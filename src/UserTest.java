import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void test() {
		User user1 = new User("Andres", "andres@andrewshop.com", "qwerty", 0001);
		assertEquals("Andrés","Andrés");
	}

}
