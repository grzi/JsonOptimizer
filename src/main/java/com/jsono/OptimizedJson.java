package com.jsono;

public class OptimizedJson {
	
	private String originJson;
	private String originClass;
	
	OptimizedJson() {}
	
	
	public String getOriginJson() {
		return originJson;
	}

	void setOriginJson(String originalJson) {
		this.originJson = originalJson;
	}
	
	void setOriginClass(String className){
		this.originClass = className;
	}

	public Object getOriginalJsonInfos() {
		return "Encoded from : " + originClass;
	}
}
