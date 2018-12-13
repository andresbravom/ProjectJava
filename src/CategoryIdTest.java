import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryIdTest {

	@Test
	void test() {
		Category video = new Category("Video", 1);
		
		assertEquals(1, video.getId_category());
	}

}
