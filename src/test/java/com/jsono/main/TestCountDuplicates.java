package com.jsono.main;

import java.io.IOException;
import java.io.InputStream;

public class TestCountDuplicates {
	public static void main(String[] args) throws IOException {
		TestCountDuplicates t = new TestCountDuplicates();
		
		 ClassLoader loader = TestCountDuplicates.class.getClassLoader();
		 InputStream is = loader.getResourceAsStream("sample_json_1.json");

		 byte[] b = null;
		 int numBytes = is.read(b);
	}
}
