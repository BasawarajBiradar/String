package practiseString;

public class LastIndexOfWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefgh";
		String s1="de";
		int index=0;
		if(s1.length()<=s.length())
		{
			int i=s.length()-1;
			for(;i>=0;i--)
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
						index=i;
						break;
					}
				}
			}
				System.out.println(index);
		}
		else
			System.out.println(-1);

	}

}
