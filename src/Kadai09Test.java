import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai09Test {

	@Test
	void test() {
		Kadai09 k = new Kadai09();
		assertEquals("001",k.numberDigit(1, 3));
		assertEquals("013",k.numberDigit(13, 3));
		assertEquals("100",k.numberDigit(100, 3));
		assertEquals("000",k.numberDigit(0, 3));
		
	}

}
