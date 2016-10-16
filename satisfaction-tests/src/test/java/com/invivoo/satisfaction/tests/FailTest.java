package com.invivoo.satisfaction.tests;

import org.junit.Test;

public class FailTest {
	@Test
	public void test(){
		throw new RuntimeException();
	}
}
