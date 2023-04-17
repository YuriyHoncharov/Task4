package ua.com.foxminded.yuriy;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		CharCollection charCount = new CharCollection();
		String str = "nice to meet you1.";
		Map<String, Integer> letters = charCount.countUniqueCharacters(str);
		System.out.println(charCount.printUniqueCharacter(letters));
	}
}
