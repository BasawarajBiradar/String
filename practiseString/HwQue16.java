package practiseString;

public class HwQue16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count and print all the duplicates in the string
		String s="aabbcccccddee";
		String duplicateElements="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)) 
				{
					count++;
					duplicateElements=duplicateElements+s.charAt(i);
					break;
				}
			}
		}
		System.out.println(count);
		System.out.println(duplicateElements);
	}

}
