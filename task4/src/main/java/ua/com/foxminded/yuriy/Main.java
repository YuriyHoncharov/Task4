package ua.com.foxminded.yuriy;

import java.util.ArrayList;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		CharCollection charCounter = new CharCollection();
      String str = "sdfsfaWSGAEGHAGFAwsedfawfwaedfAWSEDFASDFASDGASFDGASDFGASDFSADFASFASdfgawsg";
      System.out.println("Unique characters in \"" + str + "\":");
      int uniqueCharCount = charCounter.countUniqueCharacters(str);
      System.out.println("Total count: " + uniqueCharCount);
      int uniqCharAgain = charCounter.countUniqueCharacters(str);
      System.out.println("Total count: " + uniqCharAgain);
      
		
	}
}
