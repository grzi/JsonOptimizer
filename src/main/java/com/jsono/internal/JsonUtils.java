package com.jsono.internal;

public class JsonUtils {
	private JsonUtils(){}
	
	public static String deleteUselessChar(String json){
		String result = json.replaceAll("\n","");
		return result;
	}
}
