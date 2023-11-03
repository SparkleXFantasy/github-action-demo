package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result1 = main.add(1, 1);
		assertEquals(2, result1);
		int result2 = main.add(1, 2);
		assertEquals(3, result2)
	}

}
