package practiseString;

import java.util.Arrays;

public class HwQue34 {

	public static void main(String[] args)
	{
		String s1 = "abc abcde a ab abcdef abcd";
		String s[] = s1.split(" ");

		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i + 1; j < s.length; j++) 
			{
				if (s[i].length() > s[j].length())
				{
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("largest word in string is "+s[s.length-1]+"\nsmallest word in string is "+s[0]);
		
	}
}
