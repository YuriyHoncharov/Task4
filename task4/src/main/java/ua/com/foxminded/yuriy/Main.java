package ua.com.foxminded.yuriy;

import java.util.ArrayList;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		CharCollection charCount = new CharCollection();
		String str = "Nice!!!";
		Map<Character, Integer> letters = charCount.countUniqueCharacters(str);
		System.out.println(charCount.printUniqueCharacter(letters));
		
		
		

	}
}
