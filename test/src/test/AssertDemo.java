package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertDemo {
	@Test
	void method() {
		int r=1;
		int exp=2;
		assertEquals(r,exp);
	}
	@Test
	void assertTrueTest() {
		assertTrue("hello".contains("m"));
	}
	@Test
	void assertNulltest() {
		String s=null;
		assertNull(s);
	}
}
