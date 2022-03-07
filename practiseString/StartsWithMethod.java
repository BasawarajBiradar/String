package practiseString;

public class StartsWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcdef";
		String s1="aib";
		System.out.println(s.startsWith(s1));
		if(s.length()>s1.length())
		{
			int i=0;
			for(;i<s1.length();i++)
			{
				if(s.charAt(i)!=s1.charAt(i))
				{
					break;
				}
			}
			if(i<s1.length())
				System.out.println(false);
			else
				System.out.println(true);
		}
		else
			System.out.println(false);
		

	}

}
