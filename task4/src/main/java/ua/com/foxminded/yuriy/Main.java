package ua.com.foxminded.yuriy;

import java.util.ArrayList;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		CharCollection charCount = new CharCollection();
		String str = "Hello World!";
		Map<String, Integer> letters = charCount.countUniqueCharacters(str);
		System.out.println(charCount.printUniqueCharacter(letters));
	}
}
