package org.example.impls;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ExampleTest extends TestCase {

	@Test
	public void test() throws Exception {
		
		String result = new Example().sayHello("Muhammad");
		assertEquals("Hello Muhammad",result);
	}

}
