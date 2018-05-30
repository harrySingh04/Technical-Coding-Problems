package Problem5;

public class Solution {

	public static String convert(String s, int numRows) {

		StringBuilder newS = new StringBuilder(""); // The string in which we will append the string according to zig
													// zag way

		int numSingleCols = numRows - 2, moveForward, j, moveDownForward = 0;

		// Move forward based on number of rows and how many single columns will be
		// there
		moveForward = numRows + numSingleCols;

		// It will keep track of the number of characters encountered and as we reach
		// the end then return.
		int count = 0;

		// As every columns with single element will be encountered first so we will
		// alter every track and proceed accordingly
		boolean alter = true;

		// Base case we will return if number of rows is 1 and
		if (numRows == 1 || s.length() <= 1)
			return s;
		else {

			for (int i = 0; i < numRows; i++) {
				// If we are at the top row or the bottom row then we need to proceed
				// Accordingly
				if (i == 0 || i == numRows - 1) {

					j = i + moveForward;
					
				} else {
					//Else if we are in the middle row then we need to move depending upon which row we are in.
					moveDownForward = moveForward - i * 2;
					j = moveDownForward + i;
				}
				
				newS.append(s.charAt(i));
				
				count++;
				//Check if we reach end of the string and then return
				if (count == s.length())
					return newS.toString();
				
				alter = true;
				
				while (j < s.length()) {

					newS.append(s.charAt(j));
					count++;
					if (count == s.length())
						return newS.toString();
					
					if (alter && i != 0 && i != numRows - 1) {
						j = j + i * 2;
						alter = false;
						
					} else {
						//Move forward accordingly if you are at top and bottom row.
						if (i == 0 || i == numRows - 1)
							j += moveForward;
						
						else
							j += moveDownForward;
						alter = true;
					}

				}

			}

		}

		return newS.toString();

	}
}
