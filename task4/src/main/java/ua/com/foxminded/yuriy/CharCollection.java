package ua.com.foxminded.yuriy;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCollection {

	private Map<String, Map<String, Integer>> cache = new LinkedHashMap<>();
	private static final String LETTER_PRINT = "CHARACTER : ";
	private static final String AMOUNT_PRINT = " AMOUNT : ";
	private static final String QUOTE = "\"";
	private static final String NEW_LINE = "\n";
	private static final String MAP_IS_EMPTY = "This HashMap is Empty.";
	private static final String TITLE_PRINT = "Unique characters in the String: ";

	// Creating Map as Unique Character Counter

	public Map<String, Integer> countUniqueCharacters(String input) {

		if (input == null) {
			return null;
		}

		input = input.toLowerCase();

		if (cache.containsKey(input)) {
			System.out.println("String has been already counted, returning result from cache...");
			return cache.get(input);
		}

		Map<String, Integer> charCount = new LinkedHashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char x = input.charAt(i);
			String c = String.valueOf(x);
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		cache.put(input, charCount);
		return charCount;
	}

	// Printing the result of counting

	public String printUniqueCharacter(Map<String, Integer> uniqueCharactersList) {

		if (uniqueCharactersList == null) {
			return null;
		}
		if (uniqueCharactersList.isEmpty()) {
			return MAP_IS_EMPTY;
		}

		int uniqueAmount = uniqueCharactersList.size();
		StringBuilder result = new StringBuilder();
		result.append(TITLE_PRINT).append(uniqueAmount).append(NEW_LINE);
		uniqueCharactersList.forEach((key, value) -> result.append(LETTER_PRINT).append(QUOTE).append(key).append(QUOTE)
				.append(AMOUNT_PRINT).append(value).append(NEW_LINE));
		return result.toString();
	}
}
