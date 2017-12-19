package com.jsono.internal;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class JsonUtilsTest {
	static final String EXEMPLE_TEXT_JSON_FORMATTED = "{\"poire\":\n\"fruit\"}";
	static final String EXEMPLE_TEXT_JSON = "{\"poire\":\"fruit\"}";

	@Test
	public void test_deleteUselessChar() {
		assertEquals(EXEMPLE_TEXT_JSON, JsonUtils.deleteUselessChar(EXEMPLE_TEXT_JSON_FORMATTED));
	}
	
	@Test
	public void test_getDuplicates_empty(){
		Map<String,Duplicate> duplicates = JsonUtils.getDuplicates(EXEMPLE_TEXT_JSON);
		assertEquals(0,duplicates.size());
	}
}