package Problem4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindLongestPalindrome {
	static List<String> notPalindromeStrings = new ArrayList<String>();
	static List<String> palindromeStrings = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String s = input.next();
		System.out.println(longestPalindrome(s));
		
	}
	public static String longestPalindrome(String s) {
		
		
		
		//StringBuilder longestString = new StringBuilder("");
		//String maxString=null;
		int maxLength=1,start = 0,last = 0;;
		boolean isPalind = false;
		
		for(int i=0;i<s.length()-1 && maxLength<s.substring(i).length();i++) {
			
			

		
			for(int j=s.length()-1;j>i && maxLength<s.substring(i,j+1).length() ;j--) {
				//System.out.println(notPalindromeStrings.contains(s.substring(i+1,j)));
				if(s.charAt(i)==s.charAt(j) ) {
					if(notPalindromeStrings.contains(s.substring(i+1,j)))
						System.out.println("Found some");
					//Check recursively if substrings are also equal
					isPalind = checkSubPalind(s.substring(i+1,j));
					// If found , then that will be our longest substring
					if(isPalind)
					{
						maxLength = s.substring(i,j+1).length();
						start = i;
						last = j;
						
				}
					else if(!notPalindromeStrings.contains(s.substring(i+1,j))) {
						notPalindromeStrings.add(s.substring(i+1,j));
					}
				
				/*if(s.charAt(i)==s.charAt(j) && s.substring(i,j+1).length()>maxLength) {
					isPalind = checkPalindrome(s.substring(i,j+1));
					if(isPalind) {
						maxString = s.substring(i,j+1).intern();
						maxLength = s.length();
					}
				}*/
			}
		}
		}
		
		if(maxLength==1) {
			return s.substring(0,1);
		}
		else {
			return s.substring(start,last+1);
		}
		
		
			
		}
	
	
	
	
	public static boolean checkSubPalind(String subString) {
		if(notPalindromeStrings.contains(subString))
		{
			
			System.out.println("Found some");
			return false;
		}
		int i=0,j =subString.length()-1;
		if(i>=j)
			return true;
		else {
			if(subString.charAt(i)==subString.charAt(j))
				return checkSubPalind(subString.substring(1,j));
		
		else
			return false;
		}
	}
	
	
}
