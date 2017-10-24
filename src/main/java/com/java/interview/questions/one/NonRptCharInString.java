package com.java.interview.questions.one;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRptCharInString {

	public static void main(String args[]) {
		String s = "a king in the kingdom of America";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char c[] = s.toCharArray();
		int count =0;
		for (char ch : c) {
			if (map.containsKey(ch)) {
				 count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (char ch : c) {
			if (map.get(ch) == 1) {
				System.out.println("First non repeated characted in the given string \"" + s + "\" is : " + ch);
				break;
			}
		}
	}
}
