import java.util.*;

public class RemoveDuplicateCharacters {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word to test for uniqueness: ");
		String testString = input.nextLine();
		String printRes = removeDuplicates(testString);
		System.out.println(printRes);
	}
	
	
	public static String removeDuplicates(String str)
	{
		
		String adjustedStr1 = str.toLowerCase();
		String adjustedStr2 = str.toLowerCase();
		String temp = "";
		int count = 0;
		char currentChar;
		char nextChar;
		for (int i = 0; i < str.length(); i++)
		{
			currentChar = adjustedStr1.charAt(i);
			for (int j = 0; j < adjustedStr2.length(); j++)
			{
				nextChar =  adjustedStr2.charAt(j);
				if (currentChar == nextChar)
				{
					count++;
				} 	 
			}		
			if (count <= 1)
			{
				temp = temp + currentChar;
			}
			count = 0;
		}
		
		return temp;
	}


}
