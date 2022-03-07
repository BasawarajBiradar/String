package practiseString;

public class CompareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="abce";
		System.out.println(s1.compareTo(s2));
		boolean diffFound=false;
		for(int i=0;i<s1.length() && i<s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println(s1.charAt(i)-s2.charAt(i));
				diffFound=true;
				break;
			}
			
		}
		if(diffFound==false)
		{
			System.out.println(s1.length()-s2.length());
		}

	}

}
