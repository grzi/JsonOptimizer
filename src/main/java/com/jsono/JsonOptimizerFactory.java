package com.jsono;

public class JsonOptimizerFactory {
	private JsonOptimizerFactory() {}
	
	public static IEngine getReader(){
		return JsonO.getInstance();
	}
}
