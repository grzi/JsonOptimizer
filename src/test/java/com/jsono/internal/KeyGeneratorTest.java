package com.jsono.internal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class KeyGeneratorTest {
	
	KeyGenerator keyGenerator;
	
	@Before
	public void init() {
		keyGenerator = KeyGenerator.Instance();
		keyGenerator.reset();
	}
	
	@Test
	public void test_getFutureKeyDefinition(){
		assertEquals("{\"test\":a}", keyGenerator.getFutureKeyDefinition("test"));
	}
	
	@Test
	public void test_getFutureKey(){
		assertEquals("a", keyGenerator.getFutureKey());
	}
	
	@Test
	public void test_generateKey(){
		Duplicate d = Duplicate.initDuplicate("test");
		keyGenerator.generateKey(d);
		assertEquals("{\"test\":a}", d.getCompressedValueDefinition());
	}
	
	@Test
	public void test_getFutureKey_afterGenerate(){
		Duplicate d = Duplicate.initDuplicate("test");
		keyGenerator.generateKey(d);
		assertEquals("b", keyGenerator.getFutureKey());
	}
}
