package practiseString;

public class HwQue19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing after removing duplicates from the string
		String s="aaabbbcccdddee";
		String unique="";
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					break;
				}
			}
			if(count==0)
				unique=unique+s.charAt(i);
		}
		System.out.println(unique);

	}

}
