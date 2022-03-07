package practiseString;

public class ToUpperCaseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="AWcdEf";
		String s2="";
		char s1[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>'Z')
			   s1[i]=(char)(s.charAt(i)-32);
			else
				s1[i]=s.charAt(i);
		}
		s2=new String(s1);
		System.out.println(s1);
	}

}
