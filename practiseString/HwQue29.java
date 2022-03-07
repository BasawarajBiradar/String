package practiseString;

import java.util.Arrays;

public class HwQue29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"ijkl","qrst","efgh","xyz","mnop","uvw","abcd"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
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
