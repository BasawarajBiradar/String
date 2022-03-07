package practiseString;

public class HwQue27_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" ab   a ed f    df a df saf df d  ";
//		s=s.trim();
		String s1="";
		int start=0;
		int end=s.length();
		for(int i=start;i<end-2;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ' && s.charAt(i+2)==' ')
			{}
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);

	}

}
