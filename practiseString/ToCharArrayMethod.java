package practiseString;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghijkl";
		System.out.println(s.toCharArray());
		char ch[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}System.out.println();

	}

}
