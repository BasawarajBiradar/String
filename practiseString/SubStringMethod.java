package practiseString;

public class SubStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghi";
		int start=1;
		int end=3;
		System.out.println(s.substring(1, 3));
		String s1="";
		for(int i=start;i<end;i++)
		{
			s1=s1+s.charAt(i);
		}
		
		System.out.println(s1);

	}

}
