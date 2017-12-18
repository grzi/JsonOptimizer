package com.jsono;

public class JsonEncoder implements IEngine {
	private static class JsonReaderHolder{
		private static final JsonEncoder instance = new JsonEncoder();
	}
	static JsonEncoder getInstance(){
		return JsonReaderHolder.instance;
	}
	
	public OptimizedJson compress(String toOptimize){
		OptimizedJson compressed = new OptimizedJson();
		compressed.setOriginJson(toOptimize);
		compressed.setOriginClass(toOptimize.getClass().getSimpleName());
		return compressed;
	}
}
