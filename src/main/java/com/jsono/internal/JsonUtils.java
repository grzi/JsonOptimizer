package com.jsono.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JsonUtils {
	private JsonUtils() {
	}

	public static String deleteUselessChar(String json) {
		String result = json.replaceAll("\n", "");
		return result;
	}

	static Map<String, Duplicate> getDuplicates(String exempleTextJson) {
		Map<String, Duplicate> duplicates = new HashMap<String, Duplicate>();
		String splittableJson = exempleTextJson.replaceAll("(\\{|\\}|\"| )","");
		String[] words = splittableJson.split("(\\,|\\:)");
		for (String word : words) {
			if(!duplicates.containsKey(word)){
				duplicates.put(word, Duplicate.initDuplicate(word));
			}else{
				duplicates.get(word).addIteration(); 
			}
		}
		
		return filterDuplicates(duplicates);
	}

	private static Map<String, Duplicate> filterDuplicates(Map<String, Duplicate> duplicates) {
		return duplicates.entrySet().stream().filter(map -> (map.getValue().getIteration() > 1))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
	}
}
