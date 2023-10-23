package test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void testingAsuump() {
		int s=5, a=25;
		Assumptions.assumeTrue(a!=s*s);
		System.out.println("it will be displayed");
	}
}
