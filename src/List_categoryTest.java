import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class List_categoryTest {

	@Test
	void testSearchCategory() {
		Category actualCategory = Category.general.search_category("Home"");
		assertEquals(null, actualCategory);	
	}
}
