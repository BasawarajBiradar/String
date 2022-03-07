package practiseString;

public class IndexOfWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefgh";
		String s1="hi";
		if(s1.length()<=s.length())
		{
			int i = 0;
			for (; i < s.length()-s1.length()+1; i++) 
			{
				if(s.charAt(i)==s1.charAt(0))
				{
					String substring="";
					for(int j=i;j<i+s1.length();j++)
					{
						substring=substring+s.charAt(j);
					}
					if(substring.equals(s1))
					{
						System.out.println(i);
						break;
					}
				}
			}
			if(i==s.length()-s1.length()+1)
				System.out.println(-1);
		}
		else
			System.out.println(-1);
		
	}

}
