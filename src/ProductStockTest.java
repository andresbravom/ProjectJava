import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductStockTest {

	@Test
	void test() {
		Category video = new Category("Video", 1);
		Product movie1 = new Product("Titanic", 1, "Video", 20, 8.50);
		
		assertEquals(20, movie1.getStock());
	}

}
