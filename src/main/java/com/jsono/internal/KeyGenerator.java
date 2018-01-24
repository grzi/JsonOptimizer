package com.jsono.internal;

public class KeyGenerator {
	private int currentKey = 0;
	private int currentPrefix = 0;
	private static int alphanumeric_delta = 97;
	private KeyGenerator(){}
	private static class SingletonHolder{
		private static final KeyGenerator instance = new KeyGenerator();
	}
	
	public static KeyGenerator Instance(){
		return SingletonHolder.instance;
	}

	public void reset() {
		currentKey = 0;
	}
	
	public String getFutureKeyDefinition(String value){
		return "{\"" + value + "\":"+((char)(currentKey+alphanumeric_delta))+"}";
	}
	
	public String getFutureKey(){
		return "" + (currentPrefix > 0 ? (char)currentPrefix : "") + (char)(currentKey+alphanumeric_delta);
	}

	public void generateKey(Duplicate duplicate) {
		duplicate.setCompressedValue(getFutureKey());
		duplicate.setCompressedValueDefinition(getFutureKeyDefinition(duplicate.getValue()));
		currentKey++;
	}
	
}
