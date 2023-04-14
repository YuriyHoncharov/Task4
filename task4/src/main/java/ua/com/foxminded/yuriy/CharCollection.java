package ua.com.foxminded.yuriy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.stream.events.Characters;

public class CharCollection {

	private Map<String, Integer> cache;
	private static final String LETTER_PRINT = "LETTER : ";
	private static final String AMOUNT_PRINT = " AMOUNT : ";
	private static final String QUOTE = "\"";

	public CharCollection() {
		cache = new LinkedHashMap<>();
	}

	public int countUniqueCharacters(String input) {
		
		input = input.toLowerCase();
		if (cache.containsKey(input)) {
			return cache.get(input);
		}

		Map<Character, Integer> charCount = new LinkedHashMap<>();
		int uniqueTotalCount = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			} else {
				charCount.put(c, 1);
				uniqueTotalCount++;
			}
						
			}
		charCount.forEach((key, value) -> System.out.println(LETTER_PRINT + QUOTE + key + QUOTE + AMOUNT_PRINT + value));
		this.cache.put(input, uniqueTotalCount);
		
		return uniqueTotalCount;
		
	}

	
	

}
