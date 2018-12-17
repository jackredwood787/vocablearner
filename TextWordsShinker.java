package com.cbestc.util.others.memorytrainer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.cbestc.util.FileSystemUtil;
import com.cbestc.util.StringUtil;

public class TextWordsShinker {
	private static Set<String> knownWords = new TreeSet<String>();
	private static Set<String> allWordsDictionary = new TreeSet<String>(); 
	// https://openlibrary.org/search?subject_facet=Romance&q=Jane+Austen&m=edit&has_fulltext=true
	static {
		String[] knownWordsAR = new String[] {
			"ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", 
			"ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", 
			"ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", 
			"ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", 
			"ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", 
			"ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", 
			"ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", 
			"ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd", "ddddddd",          
		};
		for (String knownWord : knownWordsAR) {
			knownWords.add(knownWord);
		} 
		System.out.println("knownWords.size = " + knownWords.size());
		try {
			String filePathKW = "D:/workspace-java/GC_CBestC_JAVA/src/com/cbestc/util/others/memorytrainer/TextWordsKnownWordsLog1.java";
			String fileTextKW = FileSystemUtil.readStringFromFile(filePathKW);
			String[] words = fileTextKW.split(" ");
			// Set<String> wordsList = new TreeSet<String>();
			
			for (String word : words) {
				word = word.replace("\n", "");
				word = word.replace("\r", "");
				if (word.trim().length() > 0) {
					if (knownWords.contains(word.trim().toLowerCase()) == false) {
						knownWords.add(word.trim().toLowerCase());
					}
				}
			}
		} catch (Exception e) {
			
		}
		System.out.println("knownWords.size = " + knownWords.size());
		
		
		try {
			String filePathKW = "D:/workspace-java/GC_CBestC_JAVA/src/com/cbestc/util/others/memorytrainer/TextWordsAllWordsValid.txt";
			String fileTextKW = FileSystemUtil.readStringFromFile(filePathKW);
			fileTextKW = fileTextKW.replace("\r", "");
			String[] words = fileTextKW.split("\n");
			// ArrayList<String> ddd = new ArrayList<String>();
			// ddd.add
			allWordsDictionary.addAll(Arrays.asList(words));
			System.out.println("words in all words dictionary = " + allWordsDictionary.size());
			System.out.println("contains velocity? = " + allWordsDictionary.contains("velocity"));
		} catch (Exception e) {
			
		}
	}
	
	/*
	     

	 */
	
	
	
	public static void main(String[] args) throws Exception {
		doShrink();
	}
	
	private static void doShrink() throws Exception {
		String filePath = "D:/Temp/PeopleDeepLearning/testdest/textwords1.txt";
		String fileText = FileSystemUtil.readStringFromFile(filePath);
		
		fileText = fileText.replace(",", "  ");     fileText = fileText.replace("0", "  "); 		fileText = fileText.replace(":", "  ");
		fileText = fileText.replace(".", "  "); 	fileText = fileText.replace("1", "  "); 		fileText = fileText.replace("&", "  ");
		fileText = fileText.replace("[", "  "); 	fileText = fileText.replace("2", "  "); 		fileText = fileText.replace("/", "  ");
		fileText = fileText.replace("]", "  "); 	fileText = fileText.replace("3", "  "); 		fileText = fileText.replace("*", "  ");
		fileText = fileText.replace("â€œ", "  "); 	fileText = fileText.replace("4", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("â€�", "  "); 	fileText = fileText.replace("5", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("â€”", "  "); 	fileText = fileText.replace("6", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("\"", "  "); 	fileText = fileText.replace("7", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("'", "  "); 	fileText = fileText.replace("8", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("  ", " "); 	fileText = fileText.replace("9", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("?", "  "); 	fileText = fileText.replace(";", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("%", "  "); 	fileText = fileText.replace("$", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("(", "  "); 	fileText = fileText.replace("#", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace(")", "  "); 	fileText = fileText.replace("@", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("!", "  "); 	fileText = fileText.replace("-", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		fileText = fileText.replace("!", "  "); 	fileText = fileText.replace("`", "  "); 		fileText = fileText.replace("ddddddd", "  ");
		
		String[] words = fileText.split(" ");
		Set<String> wordsList = new TreeSet<String>();
		
		for (String word : words) {
			word = word.replace("\n", "");
			word = word.replace("\r", "");
			if (word.trim().length() > 0) {
				if (wordsList.contains(word.trim().toLowerCase()) == false
						&& knownWords.contains(word.trim().toLowerCase()) == false
					
						&& allWordsDictionary.contains(word.trim().toLowerCase())) {
					wordsList.add(word.trim().toLowerCase());
				}
			}
		}
		
		System.out.println("wordsList.size = " + wordsList.size());
		List<String> wordsListHere = new LinkedList<String>();
		// wordsListHere.addAll(wordsList);
		
		int textCountInLine = 0;
		
		List<String> shuffledList = new LinkedList<String>();
		shuffledList.addAll(wordsList);
		Collections.shuffle(shuffledList);
		
		for (String word : shuffledList) {
			wordsListHere.add(word);
			textCountInLine += word.trim().length();
			if (textCountInLine > 80) {
				wordsListHere.add("\n");
				textCountInLine = 0;
			}
		}
		System.out.println("wordsListHere.size = " + wordsListHere.size());
		
		// Collections.shuffle(wordsListHere);
		String resultText = StringUtil.getStringFromStringsListSeparatedByComma(wordsListHere, "", "  ");
		// System.out.println(resultText + "\n\n");
		
		resultText = resultText.replace(",", "  ");
		resultText = resultText.replace(".", "  ");
		resultText = resultText.replace("[", "  ");
		resultText = resultText.replace("]", "  ");
		resultText = resultText.replace("\"", "  ");
		resultText = resultText.replace("'", "  ");
		resultText = resultText.replace("  ", " ");
		// System.out.println(resultText);
		FileSystemUtil.writeStringToFile(filePath, resultText);
	}
}
