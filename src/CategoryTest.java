import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CategoryTest {

	@Test
	void test() {
		Category video = new Category("video", 01);
		assertEquals(video, video);
	}

}
