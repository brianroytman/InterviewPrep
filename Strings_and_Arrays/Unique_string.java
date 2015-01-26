import java.util.*;
public class Unique_string {
	
	public static void main(String args[])
	{
		Scanner stringInput = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String input = stringInput.next();
		System.out.println(isStringUnique(input));
	}
	
	public static boolean isStringUnique(String str)
	{
		boolean[] charTest = new boolean[256];
		boolean unique = false;
		/*
		for (int i = 0; i < 3; i++)
		{
			System.out.println(charTest[i]);
		}
		*/
		for (int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if (charTest[val])
				return false;
			charTest[val] = true;
		}
		
		return true;
	}
}
