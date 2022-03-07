package practiseString;

import java.util.Arrays;

public class HwQue28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"abc","abcde","a","ab","abcdef","abcd"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			 {
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			 }
		}
		System.out.println(Arrays.toString(s));

	}

}
