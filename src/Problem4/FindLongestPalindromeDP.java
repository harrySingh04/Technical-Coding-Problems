package Problem4;

public class FindLongestPalindromeDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("harmardrashimarddramigh"));
	}
	
	public static String longestPalindrome(String s) {
		int maxLength = 1,longestBegin = 0;
		boolean[][] table = new boolean[1000][1000];
		 for (int i = 0; i < s.length(); i++) {
			    table[i][i] = true;
			  }
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				maxLength = 2;
				table[i][i+1] = true;
				longestBegin = i;
			}
		}
		
		 for (int len = 3; len <= s.length(); len++) {
			    for (int i = 0; i < s.length()-len+1; i++) {
			      int j = i+len-1;
			      if (s.charAt(i) == s.charAt(j) && table[i+1][j-1]) {
			        table[i][j] = true;
			        longestBegin = i;
			        maxLength = len;
			      }
			    }
			  }
			  return s.substring(longestBegin, maxLength+longestBegin);
		
	}

}
