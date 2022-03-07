package practiseString;

import java.util.Arrays;

public class HwQue17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="we all are good students";
		String s1="";
		String rev[]=s.split(" ");
		
		for(int i=0;i<rev.length;i++)
		{
			String s2=rev[i];
			char[]ch=s2.toCharArray();
			int st=0;
			int end=ch.length-1;
			while(end>st)
			{
				char temp=ch[st];
				ch[st]=ch[end];
				ch[end]=temp;
				end--;
				st++;
			}
			s2=new String(ch);
			rev[i]=s2;
		}
		for(int i=0;i<rev.length;i++)
		{
			s1=s1+rev[i]+" ";
		}
		System.out.println(s1);
		

	}

}
