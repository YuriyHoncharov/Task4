package ua.com.foxminded.yuriy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class CharCollectionTest {
	
	private final CharCollection test = new CharCollection();
	private final String NEW_LINE = "\n";

	@Test
	void countUniqueCharacters_inputIsNull_returnNull() {
			String testString = null;
			assertNull(test.countUniqueCharacters(testString));
		}
	
	@Test
	void countUniqueCharacters_regularInput_returnRightMap() {
		Map <String, Integer> mapForTest = new LinkedHashMap<>();
		mapForTest.put("h", 1);
		mapForTest.put("e", 1);
		mapForTest.put("l", 2);
		mapForTest.put("o", 1);
		mapForTest.put("!", 1);
		String testString = "Hello!";
		assertEquals(mapForTest, test.countUniqueCharacters(testString));
	}
		
		@Test
		void countUniqueCharacters_stringIsCached_returnMapFromCache() {
			String testString = "Hello!";
			test.countUniqueCharacters(testString);
			Map <String, Integer> mapForTestCache = new LinkedHashMap<>();
			mapForTestCache.put("h", 1);
			mapForTestCache.put("e", 1);
			mapForTestCache.put("l", 2);
			mapForTestCache.put("o", 1);
			mapForTestCache.put("!", 1);
			String testStringCache = "Hello!";
			assertEquals(mapForTestCache, test.countUniqueCharacters(testStringCache));
				
	}
	@Test
	void printUniqueCharacter_inputIsNull_returnNull() {
		Map <String, Integer> mapForTest = null;
		assertNull(test.printUniqueCharacter(mapForTest));
	}
	
	@Test
	void printUniqueCharacter_inputIsEmpy_returnAdvertisement() {
		Map <String, Integer> mapForTest = new LinkedHashMap<>();
		assertEquals("This HashMap is Empty.", test.printUniqueCharacter(mapForTest));
	}
	
	@Test
	void printUniqueCharacter_regularInput_printCorrectResult() {
		String result = "Unique characters in the String: 5" + NEW_LINE
				+ "CHARACTER : \"n\" AMOUNT : 1" + NEW_LINE
				+ "CHARACTER : \"i\" AMOUNT : 1" + NEW_LINE
				+ "CHARACTER : \"c\" AMOUNT : 1" + NEW_LINE
				+ "CHARACTER : \"e\" AMOUNT : 1" + NEW_LINE
				+ "CHARACTER : \"!\" AMOUNT : 3" + NEW_LINE;
		Map <String, Integer> mapForTest = new LinkedHashMap<>();
		mapForTest.put("n", 1);
		mapForTest.put("i", 1);
		mapForTest.put("c", 1);
		mapForTest.put("e", 1);
		mapForTest.put("!", 3);
		assertEquals(result, test.printUniqueCharacter(mapForTest));
	}
}
