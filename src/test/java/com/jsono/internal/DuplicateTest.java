package com.jsono.internal;

import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateTest {
	
	@Test
	public void Duplicate_toString_Empty(){
		Duplicate duplicate = new Duplicate();
		assertEquals("Duplicate value = , iteration = 0, compressed value = ", duplicate.toString());
	}
}
