import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListCategoryTest {

	@Test
	void testSearchCategory() {
		Category actualCategory = Category.general.searchCategory("Home");
		assertEquals(null, actualCategory);	
	}
}
