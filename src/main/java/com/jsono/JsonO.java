package com.jsono;

public class JsonO implements IEngine {
	private static class JsonReaderHolder{
		private static final JsonO instance = new JsonO();
	}
	static JsonO getInstance(){
		return JsonReaderHolder.instance;
	}
}
