package practiseString;

public class EndsWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		String s1="ef";
		if(s1.length()<=s.length())
		{
			int i=s.length()-1;
			int j=s1.length()-1;
			while(j>=0)
			{
				if(s.charAt(i)!=s1.charAt(j))
				{
					System.out.println(false);
					break;
				}
				i--;
				j--;
			}
			if(j>=0)
				System.out.println(false);
			else
				System.out.println(true);
		}
		else
			System.out.println(false);

	}

}
