package practiseString;

public class HwQue31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdXYZ";
		String s1="";
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++)
		{
			s1=s1+(char)(155-s.charAt(i));
		}
		System.out.println(s1);
	}

}
