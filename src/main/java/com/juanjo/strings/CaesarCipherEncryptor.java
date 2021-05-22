package com.juanjo.strings;

public class CaesarCipherEncryptor {
	
	public String caesarCypherEncryptor(String str, int key) {
		StringBuilder sb = new StringBuilder("");
		if(key >25)
			key += - 26;
		for(char item : str.toCharArray()) {
			if((item + key) > 122 || key > 25){
				sb.append((char)((item + key) - 26));
				continue;
			}
			sb.append((char)(item + key));
		}
		return sb.toString();
	}
	
	// 0(n) time | 0(n) space
	public String caesarCypherEncryptor_AE(String str, int key) {
		char[] newLetters = new char[str.length()];
		int newKey = key % 26;
		for (int i = 0; i < str.length(); i++) {
			newLetters[i] = getNewLetter(str.charAt(i), newKey);
		}
		return new String(newLetters);
	}
	
	public static char getNewLetter(char letter, int key) {
		int newLetterCode = letter + key;
		return newLetterCode <= 122 ? (char) newLetterCode : (char) (96 + newLetterCode % 122);
	}
	
}
