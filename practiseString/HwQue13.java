package practiseString;

public class HwQue13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='e')
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);

	}

}
