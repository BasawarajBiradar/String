package practiseString;

public class CwQue1to9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		String s1=new String("aCGdef");
		
		System.out.println(s.charAt(4));
		
		//que 3
		System.out.println(s.compareTo(s1));
		
		//que 4
		System.out.println(s.compareToIgnoreCase(s1));
		
		//que 5
		System.out.println(s.concat(s1));
		
		
		System.out.println(s==s1);
		
//		StringBuffer snew=new StringBuffer("aCGdef");
//		String s2="";
//		
//		for(int i=0;i<snew.length();i++)
//		{
//			s2=s2+snew.charAt(i);
//		}
//		System.out.println(s2);
	}

}
