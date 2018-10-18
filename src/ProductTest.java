import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void test() {
		Category video = new Category("video", 01);	
	  Product movie1 = new Product("movie1", 01, "video", 5, 8.5);

		assertEquals("movie1","movie1");
	}

}
