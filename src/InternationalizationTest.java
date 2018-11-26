import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

class InternationalizationTest {

	@Test
	void testEnglish() {
		ResourceBundle ref = ResourceBundle.getBundle("Languages", new Locale("en", "US"));
		assertEquals(ref.getString("option"), "Choose an option:");
	}
	@Test
	void testSpanish() {
		ResourceBundle ref = ResourceBundle.getBundle("Languages", new Locale("es", "ES"));
		assertEquals(ref.getString("option"), "Elegir una opción:");
	}
	@Test
	void testFrench() {
		ResourceBundle ref = ResourceBundle.getBundle("Languages", new Locale("fr", "FR"));
		assertEquals(ref.getString("option"), "Choisissez une option:");
	}
}
