package com.juanjo.strings;

public class RunLengthEncoding {
	
	public String runLengthEncoding_(String string) {
		int count = 1;
		StringBuilder sb = new StringBuilder();
		char prev = string.charAt(0);
		for(int i = 1 ; i < string.toCharArray().length ; i++) {
			char ch = string.toCharArray()[i];
			if(ch == prev){
				count++;
			} else {
				sb.append(appendString(count, prev));
				count=1;
				prev = ch;
				continue;
			}
		}
		sb.append(appendString(count, prev));
		return sb.toString();
	}
	
	private String appendString(int times, char ch) {
		if(times < 9)
			return "" + times + ch;
		double floatNum = times/9;
		int intPart = (int) floatNum;
		int decimals = times % 9;
		String str = "";
		while(intPart > 0){
			str += "" + 9 + ch;
			intPart--;
		}
		if(decimals > 0){
			str += "" + decimals + ch;
		}
		return str;
	}
	
	// 0(n) time | 0(n) space - where n is the length of the input string
	public String runLengthEncoding(String string) {
		//The input string is guarenteed to be non-empty
		//so our first run will be of at least length 1.
		StringBuilder encodedStringCharacters = new StringBuilder();
		int currentRunLength = 1;
		
		for(int i = 1; i < string.length(); i++) {
			char currentCharacter = string.charAt(i);
			char previousCharacter = string.charAt(i - 1);
			
			if((currentCharacter != previousCharacter) || (currentRunLength == 9)) {
				encodedStringCharacters.append(Integer.toString(currentRunLength));
				encodedStringCharacters.append(previousCharacter);
				currentRunLength = 0;
			}
			
			currentRunLength += 1;
			
		}
		//Handle the last run.
		encodedStringCharacters.append(Integer.toString(currentRunLength));
		encodedStringCharacters.append(string.charAt(string.length() - 1));
		return encodedStringCharacters.toString();
	}
	
}
