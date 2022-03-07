package practiseString;


public class ReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="abefcdegefef";
//		s=s.concat("a");
//		String s1="";
//		String s2[]=s.split("ef");
//		for(int i=0;i<s2.length;i++)
//		{
//			if(i==s2.length-1)
//				s1=s1+s2[i];
//			else
//				s1=s1+s2[i]+"xy"; 
//		}
//		s="";
//		for(int i=0;i<s1.length()-1;i++)
//	    	s=s+s1.charAt(i);
//		System.out.println(s);
//		System.out.println(s.length());
//	}
		
		
		String s="abefcdegefefefef";
		String s2="ef";
		String s1="";
		int index=0;
		for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==s2.charAt(0)) {
					String substring="";
					for(int j=i;j<i+s2.length();j++){
						substring=substring+s.charAt(j);
					}
					if(substring.equals(s2)) {
						index=i;
					}	
				}
				if(i==index || i==index+1) {
					if(i==index)
					  s1=s1+"xy";
					else{}
				}
				else {
					s1=s1+s.charAt(i);
				}
					
			}
		System.out.println(s1);
		}
		
}
