package practiseString;

public class ToLowerCaseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABcDeFG";
		String s1="";
		char s2[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<='Z')
				s2[i]=(char)(s.charAt(i)+32);
			else
				s2[i]=s.charAt(i);
		}
		s1=new String(s2);
		System.out.println(s1);

	}

}
