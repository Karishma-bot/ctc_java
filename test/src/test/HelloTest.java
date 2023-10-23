package test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloTest {
	@RepeatedTest(3)
	@DisplayName("junit tester")
	@Test
	void print() {
		System.out.println("hello");
	}
	@Test
	void show() {
		System.out.println("show");
	}
}
