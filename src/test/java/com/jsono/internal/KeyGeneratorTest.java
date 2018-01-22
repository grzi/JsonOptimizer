package com.jsono.internal;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KeyGeneratorTest {
	
	KeyGenerator keyGenerator;
	
	@Before
	public void init() {
		keyGenerator = KeyGenerator.Instance();
		keyGenerator.reset();
	}
	
	@Test
	public void test_getFutureKey(){
		assertEquals("{\"test\":0}", keyGenerator.getFutureKey("test"));
	}
}
