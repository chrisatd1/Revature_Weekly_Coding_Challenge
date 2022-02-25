package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PandigitalSolution {
	public static String pandigitalBuilder (int x) {
		// Uses int x as base number, then multiplies it to incrementing int i
		// and concatenates the product into string to get the pandigital number
		// and returns that number
		
		String result = "";
		long resultInt = 0;
		int i = 1;
		while (resultInt < 987654321) {
			if (resultInt > 887654321) {
				break;
			}
			else {
			result += Integer.toString(x * i);
			resultInt = Long.parseLong(result);
			i++;
			}
		}
		List<Character> resultChars = convertStringToCharList(result);
		if (isPandigital(resultChars) == true) {
			return result;
		}
		else {
			return "";
		}
	}
	
	public static List<Character> convertStringToCharList(String str) {
  
        // Create an empty List of character
        List<Character> chars = new ArrayList<>();
  
        // For each character in the String
        // add it to the List
        for (char ch : str.toCharArray()) {
  
            chars.add(ch);
        }
  
        // return the List
        return chars;
    }
	
	public static boolean isPandigital(List<Character> num) {
		// Checks that resulting number contains every number from 1 to 9 and only has 9 digits
		return (num.contains('1') && num.contains('2') && num.contains('3') && 
				num.contains('4') && num.contains('5') && num.contains('6') && 
				num.contains('7') && num.contains('8') && num.contains('9') && 
				num.size() == 9);
	}
	
	public static void main(String[] args) {
		String panDigRes = "";
		List<Integer> baseNumList = new ArrayList<Integer>();
		int max = 0;
		for (int k = 9; k <= 9876; k++) {
			panDigRes = pandigitalBuilder(k);
			if (panDigRes != "") {
				baseNumList.add(k);
				max = Collections.max(baseNumList);
				System.out.println("Base num: " + k + ", Pandigital Result: " + panDigRes);				
			}
		}
		System.out.println("The largest base number is " + max);
	}
}
