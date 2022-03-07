package practiseString;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab cr et";
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				count++;
		}

		String a[]= new String[s.length()-count];
		int index=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i; j<s.length();j++)
			{
				String substring="";
			        if(s.charAt(j)==' ')
			        {	
			        	for(int k=i;k<j;k++)
			        	{
			        		substring=substring+s.charAt(k);
			        		//System.out.print(s.charAt(k)+" ");
			        	}
			        	System.out.print(substring);
			        	
			        } 
			       
			}
		}
//		System.out.println(Arrays.toString(a));
	}

}
