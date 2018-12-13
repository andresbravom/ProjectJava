import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductIdTest {

	@Test
	void test() {
		Category video = new Category("Video", 001);
		Product movie1 = new Product("Titanic", 00001, "Video", 20, 8.50);
		
		assertEquals(00001, movie1.getId());
		
		
	}

}
