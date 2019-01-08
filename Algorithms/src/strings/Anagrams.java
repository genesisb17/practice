package strings;

import java.util.ArrayList;

public class Anagrams {
	/*
	 * Write a method to determine if two strings are anagrams or not 
	 */
	
	public static void main(String[] args) {
		System.out.println(100-'a');
	}
	
	static boolean anagram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		ArrayList<Character> letters = new ArrayList<Character>();
		for(int i = 0; i < s1.length(); i++) {
			letters.add(s1.charAt(0));
		}
		for(Character c : letters) {
			if(s2.indexOf(c)<0) return false;
		}
		return true;
	}
	
	

}
