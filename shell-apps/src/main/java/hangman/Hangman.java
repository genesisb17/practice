package hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Hangman {
	
	static String filepath = "src/main/java/hangman/words.txt";

	public static void main(String[] args) {
		System.out.println("Welcome to Hangman!");
		guess(getWord());
	}

	static void guess(String word) {
		/*
		 * here is where you will write functionality for the hangman app
		 * A user should be able to guess letters and see their guesses after
		 * each turn. You may optionally add different categories of words, 
		 * add a limit to the amount of guesses a user may try, or more
		 */
		System.out.println("Here is a test to make sure things are working, our random word is " + word);
	}

	/*
	 * Helper method to print out the letters that a user has guessed. this
	 * can, of course, be changed or not used
	 */
	static void print(char[] letters) {
		String out = "";
		for(char c : letters) {
			out += c + " "; 
		}
		System.out.println(out);
	}

	/*
	 * This method uses BufferedReader to get a random word from our word list 
	 */
	static String getWord() {
		List<String> words = new ArrayList<String>();
		try(BufferedReader br = new BufferedReader(
				new FileReader(filepath))){
			String currLine = null;
			while((currLine=br.readLine())!=null) {
				words.add(currLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int index = (int) (Math.random() * words.size()-1);

		return words.get(index);
	}


}


