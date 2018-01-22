package com.jsono.internal;

public class KeyGenerator {
	private int currentKey = 0;
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
	
	public String getFutureKey(String value){
		return "{\"" + value + "\":"+currentKey+"}";
	}
}
