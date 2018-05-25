package Problem2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringMethodsPrac {
	
		
// Requirement is to check if a string contains all unique characters .
// We cannot use any additional data structures
	public static boolean checkString(String checkStr) {
		
		boolean[] char_set = new boolean[256];
		
		
		for(int i=0;i<checkStr.length();i++) {
			
			int val = checkStr.charAt(i);
			if(char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
		
	
	}
	
	//Reverse a string 
	public static String reverseCString(String str) {
		
		
		StringBuilder newString = new StringBuilder(str);
		int i=0,j = newString.length()-1;
		//StringBuilder swap = new StringBuilder();
		char swap;
		while(i<j) {
			swap = newString.charAt(i);
			newString.setCharAt(i, newString.charAt(j));
			newString.setCharAt(j, swap);
			i++;j--;
		}
		
		return newString.toString();
		
	}
	
	//Remove Duplicates
	public static String removeDuplicates(String str) {
		//StringBuilder newString = new StringBuilder("");
		//char[] char_set = new char[256];
		//int val;
		String newStr = "";
		for(int i=0;i<str.length();i++) {
			
		/*	val = str.charAt(i);
			if(char_set[val]==0) {
				char_set[val] = str.charAt(i);
				newString.append(char_set[val]);
			}*/
			
			if(newStr.indexOf(str.charAt(i))<0)
			{
				newStr+=str.charAt(i);
			}
			
			
			// Or alternative approach
			/*
			 * 
			 * 
			 * 
			 * */
			
		}
		
		
		
		
		return newStr;
		
		
	}
	
	//Check if Strings are anagrams or not
	public static boolean isAnagram(String str,String str2) {
		for(int i=0;i<str.length();i++) {
			
			if(str2.indexOf(str.charAt(i))<0 || str.indexOf(str2.charAt(i))<0 || str.length()!=str2.length() )
				return false;
			
			
		}
		return true;
		
		
	}

	
}
