import java.util.*;

public class StringReversal {
	public static void main(String args[])
	{
		Scanner stringInput = new Scanner(System.in);
		System.out.println("Please enter a string to reverse: ");
		String str = stringInput.nextLine();
		System.out.println(Reverse(str));
		
		
		
	}
	public static String Reverse(String s)
	{
		ArrayList<Character> reversedStringHolder = new ArrayList<Character>();
		Stack charHolder = new Stack();
		s.toCharArray();
		for (int i = 0; i < s.toCharArray().length; i++)
		{
			charHolder.push(s.charAt(i));
		}
		
		for (int j = 0; j < s.toCharArray().length; j++)
		{
			reversedStringHolder.add((Character) charHolder.pop());
		}
		
		
		StringBuilder builder = new StringBuilder(reversedStringHolder.size());
		for (Character ch : reversedStringHolder)
		{
			builder.append(ch);
		}
		
		return builder.toString();
		
		
		
	}

}
