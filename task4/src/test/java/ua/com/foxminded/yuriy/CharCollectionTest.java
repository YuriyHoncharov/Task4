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
			assertEquals(null, test.countUniqueCharacters(testString));
		}
	
	@Test
	void countUniqueCharacters_regularInput_returnRightMap() {
		Map <Character, Integer> mapForTest = new LinkedHashMap<>();
		mapForTest.put('h', 1);
		mapForTest.put('e', 1);
		mapForTest.put('l', 2);
		mapForTest.put('o', 1);
		mapForTest.put('!', 1);
		String testString = "Hello!";
		assertEquals(mapForTest, test.countUniqueCharacters(testString));
				
	}
	@Test
	void printUniqueCharacter_inputIsNull_returnNull() {
		String testString = null;
		Map <Character, Integer> mapForTest = test.countUniqueCharacters(testString);
		assertEquals(null, test.printUniqueCharacter(mapForTest));
	}
	
	@Test
	void printUniqueCharacter_inputIsEmpy_returnAdvertisement() {
		String testString = "";
		Map <Character, Integer> mapForTest = test.countUniqueCharacters(testString);
		assertEquals("This HashMap is Empty.", test.printUniqueCharacter(mapForTest));
	}
	
	@Test
	void printUniqueCharacter_regularInput_printCorrectResult() {
		String testString = "Nice!!!";
		String result = "Unique characters in the String: 5" + NEW_LINE
				+ "CHARACTER : \"n\" AMOUNT : 1" + NEW_LINE
				+ "CHARACTER : \"i\" AMOUNT : 1" + NEW_LINE
				+ "CHARACTER : \"c\" AMOUNT : 1" + NEW_LINE
				+ "CHARACTER : \"e\" AMOUNT : 1" + NEW_LINE
				+ "CHARACTER : \"!\" AMOUNT : 3" + NEW_LINE;
		Map <Character, Integer> mapForTest = test.countUniqueCharacters(testString);
		assertEquals(result, test.printUniqueCharacter(mapForTest));
	}
	
	
}
