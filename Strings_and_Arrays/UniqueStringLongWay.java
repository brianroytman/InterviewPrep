import java.util.*;

public class UniqueStringLongWay {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word to test for uniqueness: ");
		String testString = input.nextLine();
		boolean printRes = testUniqueness(testString);
		System.out.println(printRes);
	}
	
	public static boolean testUniqueness(String test)
	{	
		String currentString = test.toLowerCase();
		String duplicateString = test.toLowerCase();
		
		//System.out.println(currentString);
		//System.out.println(duplicateString);
		boolean isUnique = true;
		int counter;
		for (int i = 0; i < currentString.length(); i++)
		{
			counter = 0;
			for (int j = 0; j < duplicateString.length(); j++)
			{
				if(currentString.charAt(i) == duplicateString.charAt(j))
				{
					counter++;
					if (counter == 2)
					{
						isUnique = false;
						break;
					}
				}
				else
					continue;	
			}	
		}
		return isUnique;
	}
}
