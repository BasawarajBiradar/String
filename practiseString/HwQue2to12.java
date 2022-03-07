package practiseString;

import java.util.Arrays;

public class HwQue2to12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefg";
		String s1="abcdefg";
		System.out.println(s.endsWith("fg"));
		System.out.println(s==s1);
		String s2="ABCDEFG";
		System.out.println(s.compareToIgnoreCase(s2));
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.indexOf(s.charAt(i))+" "+s.charAt(i));
		}
		String s3="abcdefabjdh";
		System.out.println(s3.lastIndexOf("ab"));
		System.out.println(s3.length());
		System.out.println(s3.replace('d', 'f'));
		String s4="ab";
		System.out.println(s3.startsWith(s4));
		char []ch=s3.toCharArray();
		System.out.println(Arrays.toString(ch));
		String s5="ABCDEFGHJ";
		System.out.println(s5.toLowerCase());
		System.out.println(s3.toUpperCase());
		

	}

}
