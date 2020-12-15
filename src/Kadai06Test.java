import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai06Test {

	@Test
	void test() {
		Kadai06 k = new Kadai06();
		assertEquals(Integer.MIN_VALUE,k.get2ndMax(null));
		int[]test = {1,5,6,9};
	    assertEquals(6,k.get2ndMax(test));
		int[]test2 = {1,1,1,1,};
		assertEquals(1,k.get2ndMax(test2));
		
				



	}

}
