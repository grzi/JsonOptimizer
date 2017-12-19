package com.jsono.internal;

import java.util.Map;

public class JsonUtils {
	private JsonUtils(){}
	
	public static String deleteUselessChar(String json){
		String result = json.replaceAll("\n","");
		return result;
	}

	static Map<String, Duplicate> getDuplicates(String exempleTextJson) {
		// TODO Auto-generated method stub
		return null;
	}
}
