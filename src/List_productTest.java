import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class List_productTest {

	@Test
	void testSerchCategory() {
		Product actualProduct = Product.general.search_product("furniture");
		assertEquals(null, actualProduct);
	}

}
