package Problem3;

public class FindLongestSubsequence {

	
	public static void main(String[] args) {
		
	
		System.out.println(longestCommonSubsequence("babad","dabab"));
		
	}
	//Finding the longest subsequence between two strings
	 public static String longestCommonSubsequence(String firstString, String secondString) {
	     
		 String revString = " "+secondString;
		 String newS = " " +firstString;
		 int m = newS.length(),n = newS.length();
		 char[][] signTable = new char[m][n];
		 long[][] c = new long[m][n];
		 
		
		 
		 for(int i=1;i<m;i++) {
			 for(int j=1;j<n;j++) {
				 
				 if(newS.charAt(i) == revString.charAt(j)) {
					 c[i][j] = c[i-1][j-1]+1;
					 signTable[i][j]='D';
					 
				 }
				 else if(c[i-1][j]>=c[i][j-1]) {
					 c[i][j] = c[i-1][j];
					 signTable[i][j]='U';
				 }
				 else {
					 c[i][j] = c[i][j-1];
					 signTable[i][j] = 'L';
				 }
				 
			 }
		 }
		 
		String seq = printLcs(signTable,newS,m-1,n-1);
		return seq;
		 
	    }
	 
	 public static String printLcs(char[][] signTable,String s,int i,int j) {
		 StringBuilder longestString = new StringBuilder("");
		 
		 if(i==0 || j==0) {
			 return "";
		 }
		 
		 else {
			 if(signTable[i][j]=='D') {
				 longestString.append(s.charAt(i)+printLcs(signTable,s,i-1,j-1));
				 
			 }
			 
			 else if(signTable[i][j]=='U') {
				 longestString.append(printLcs(signTable,s,i-1,j));
			 }
			 else {
				 longestString.append(printLcs(signTable,s,i,j-1));
			 }
		 }
		 return longestString.toString();
	 }
	 
	
}
