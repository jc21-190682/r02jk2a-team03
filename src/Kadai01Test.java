import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Kadai01Test {

	@Test
	public void testReverseString() {
		Kadai01 k = new Kadai01();
		assertNull(k.ReverseString(null));
		assertEquals("4321",k.ReverseString("1234"));
		assertEquals(" ",k.ReverseString(" "));
		assertEquals("1",k.ReverseString("1"));
		assertNotNull(k.ReverseString("123"));

	}

}
