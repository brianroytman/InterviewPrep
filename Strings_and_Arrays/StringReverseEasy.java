import java.util.*;

public class StringReverseEasy {
	public static void main(String args[])
	{
		Scanner stringInput = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String s = stringInput.nextLine();
		
		System.out.println(reverse(s));
	}
	
	public static String reverse(String input)
	{
		//char[] holder = input.toCharArray();
		int stringLen = input.length();
		String reversedString = "";
		for (int i = stringLen -1 ;i >= 0; i--)
		{
			//reversedString = reversedString + holder[i];
			reversedString = reversedString + input.charAt(i);
		}
		
		return reversedString;
		
	}
	

}
