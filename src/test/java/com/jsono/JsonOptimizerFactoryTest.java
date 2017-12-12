package com.jsono;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;

import com.jsono.IEngine;
import com.jsono.JsonOptimizerFactory;
import com.jsono.JsonO;


public class JsonOptimizerFactoryTest {

	@Test
	public void testInitReader() {
		IEngine reader = JsonOptimizerFactory.getReader();
		assertThat(reader, instanceOf(JsonO.class));
	}
	
	@Test
	public void testSingletonReader(){
		JsonO.getInstance();
		IEngine first = JsonOptimizerFactory.getReader();
		IEngine second = JsonOptimizerFactory.getReader();
		assertSame(first,second);
	}
}
