package practiseString;

public class HwQue14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234567";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{}
			else
				count++;
		}
		if(count==0)
			System.out.println("only digits");
		else
			System.out.println("not only digits");

	}

}
