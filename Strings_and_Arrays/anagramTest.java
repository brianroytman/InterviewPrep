import java.util.*;

public class anagramTest {

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first string: ");
		String test1 = input.nextLine();
		System.out.println("Please enter second string to test against: ");
		String test2 = input.nextLine();
		
		System.out.println(testAnagram(test1, test2));
	}
	public static boolean testAnagram(String test1, String test2) //testing on sum of ASCII values for each character in the string
	{	
		String string1 = test1.toLowerCase();
		String string2 = test2.toLowerCase();
		boolean anagram = false;

		char[] string1Holder = string1.toCharArray();
		char[] string2Holder = string2.toCharArray();
		
		int finalSumString1 = getSum1(string1Holder);
		int finalSumString2 = getSum2(string2Holder);
		
		if (finalSumString1 == finalSumString2)	//if the sum of ASCII values making up string1 is equal to the sum for string2 then the strings are anagrams
		{
			anagram = true;
		}
		
		return anagram;
	}
	
	public static int getSum1(char[] string1)
	{
		int sum1 = 0;
		for(int i = 0; i < string1.length; i++)
		{
			sum1 = sum1 + (int) string1[i];
		}
		return sum1;
	}
	
	public static int getSum2(char[] string2)
	{
		int sum2 = 0;
		for(int i = 0; i < string2.length; i++)
		{
			sum2 = sum2 + (int) string2[i];
		}
		return sum2;
	}
}

