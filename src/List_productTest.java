import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class List_productTest {

	@Test
	void testSearchProduct() {
		Product actualProduct = Product.general.search_product("Furniture");
		assertEquals(null, actualProduct);
	}

}
