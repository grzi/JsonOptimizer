package com.jsono.internal;

import org.junit.Test;
import static org.junit.Assert.*;

public class JsonUtilsTest {
	static final String EXEMPLE_TEXT_JSON_FORMATTED = "{\"poire\":\n\"fruit\"}";
	static final String EXEMPLE_TEXT_JSON = "{\"poire\":\"fruit\"}";

	@Test
	public void test_deleteUselessChar() {
		assertEquals(EXEMPLE_TEXT_JSON, JsonUtils.deleteUselessChar(EXEMPLE_TEXT_JSON_FORMATTED));
	}
	
	@Test
	public void test_getRepeatCollection(){
		
	}
}