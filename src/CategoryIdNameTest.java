import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryIdNameTest {

	@Test
	void test() {
		Category video = new Category("Video", 1);
		
		assertEquals("Video", video.getName());
	}

}
