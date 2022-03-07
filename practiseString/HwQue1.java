package practiseString;

import java.util.Scanner;

public class HwQue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		char[]ch= new char[size];
		System.out.println("enter "+size+" elements");
		for(int i=0;i<size;i++)
		{
			 ch[i]=sc.next().charAt(0);
		}
		String s=new String(ch);
		System.out.println(s);

	}

}
