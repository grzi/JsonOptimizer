package com.jsono.internal;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

public class JsonUtilsTest {
	static final String EXEMPLE_TEXT_JSON_FORMATTED = "{\"poire\":\n\"fruit\"}";
	static final String EXEMPLE_TEXT_JSON = "{\"poire\":\"fruit\"}";
	static final String EXEMPLE_TEXT_JSON_WITH_ONE_DUPLICATE = "{\"poirederainette\":\"fruit\", \"pomme\":\"fruit\"}";
	static final String EXEMPLE_TEXT_JSON_WITH_TWO_DUPLICATE = "{\"pomme\":\"fruit\", \"pomme\":\"fruit\"}";

	@Test
	public void test_deleteUselessChar() {
		assertEquals(EXEMPLE_TEXT_JSON, JsonUtils.deleteUselessChar(EXEMPLE_TEXT_JSON_FORMATTED));
	}
	
	@Test
	public void test_getDuplicates_empty(){
		Map<String,Duplicate> duplicates = JsonUtils.getDuplicates(EXEMPLE_TEXT_JSON);
		assertEquals(0,duplicates.size());
	}
	
	@Test
	public void test_getDuplicates_one(){
		Map<String,Duplicate> duplicates = JsonUtils.getDuplicates(EXEMPLE_TEXT_JSON_WITH_ONE_DUPLICATE);
		assertEquals(1,duplicates.size());
	}
	
	@Test
	public void test_getDuplicates_two(){
		Map<String,Duplicate> duplicates = JsonUtils.getDuplicates(EXEMPLE_TEXT_JSON_WITH_TWO_DUPLICATE);
		assertEquals(2,duplicates.size());
	}
}