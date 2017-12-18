package com.jsono;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class JsonEncoderTest {
	
	static final String EMPTY_STRING_JSON = "{\"\":\"\"}";
	static final String EXEMPLE_TEXT_JSON = "{\"poire\":\"fruit\"}";
	
	
	JsonEncoder encoder;
	
	@Before
	public void init(){
		encoder = JsonOptimizerFactory.getEncoder();
	}
	
	@Test
	public void testOptimize_String_NotNull(){
		System.out.println(EXEMPLE_TEXT_JSON);
		assertNotNull(encoder.compress(EMPTY_STRING_JSON));
	}
	
	@Test
	public void testOptimize_String_getOriginalJson(){
		assertEquals(EMPTY_STRING_JSON,encoder.compress(EMPTY_STRING_JSON).getOriginJson());
	}
	
	@Test
	public void testOptimize_String_getOriginalJsonInfos(){
		assertEquals("Encoded from : String",encoder.compress(EMPTY_STRING_JSON).getOriginalJsonInfos());
	}
}
