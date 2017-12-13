package com.jsono;

public class JsonOptimizerFactory {
	private JsonOptimizerFactory() {}
	
	public static JsonEncoder getEncoder(){
		return JsonEncoder.getInstance();
	}
}
