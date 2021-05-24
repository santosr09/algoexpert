package com.juanjo.strings;

public class RunLengthEncoding {
	
	public String runLengthEncoding(String string) {
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
	
}
