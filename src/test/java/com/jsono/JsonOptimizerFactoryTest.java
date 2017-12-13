package com.jsono;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;

import com.jsono.IEngine;
import com.jsono.JsonOptimizerFactory;
import com.jsono.JsonEncoder;


public class JsonOptimizerFactoryTest {

	@Test
	public void testInitEncoder() {
		JsonEncoder reader = JsonOptimizerFactory.getEncoder();
		assertThat(reader, instanceOf(JsonEncoder.class));
	}
	
	@Test
	public void testSingletonEncoder(){
		JsonEncoder.getInstance();
		IEngine first = JsonOptimizerFactory.getEncoder();
		IEngine second = JsonOptimizerFactory.getEncoder();
		assertSame(first,second);
	}
}
