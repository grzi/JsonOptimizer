package com.jsono;

public class JsonEncoder implements IEngine {
	private static class JsonReaderHolder{
		private static final JsonEncoder instance = new JsonEncoder();
	}
	static JsonEncoder getInstance(){
		return JsonReaderHolder.instance;
	}
	
	public OptimizedJson optimize(String toOptimize){
		OptimizedJson optimized = new OptimizedJson();
		optimized.setOriginJson(toOptimize);
		optimized.setOriginClass(toOptimize.getClass().getSimpleName());
		return optimized;
	}
}
