package practiseString;

public class HwQue20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aababcabcdabcdeabcdefabc";
		int max=0;
		int start=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				int count=0;
				for(int k=i; k<j; k++) 
				{
					if(s.charAt(j)==s.charAt(k)) 
						count++;
				}
				if (count > 0)
				{
					int length = j - i;
					if (max < length) 
					{
						max = length;
						start = i;
					}
					break;
				}
				if (j == s.length() - 1)
				{
					int length = j - i + 1;
					if (length > max)
					{
						max = length;
						start = i;
					}
				}
			}
		}
		System.out.println(start);
		for(int i=start;i<start+max;i++)
		{
			System.out.print(s.charAt(i));
		}
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		String s="aababcabcdabcdeabcdef";
//		int start=0;
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++)
//			{
//				int count=0;
//				for(int k=i;k<j;k++)
//				{
//					if(s.charAt(k)==s.charAt(j))
//						count++;
//				}
//				if(count>0)
//				{
//					int length=j-i;
//					if(max<length)
//						{
//						  max=length;
//						  start=i;
//						}
//					break;
//				}
//				if(j==s.length()-1)
//				{
//					int length=j-i+1;
//					if(max<length) 
//					{
//						max=length;
//						start=i;
//					}	
//				}
//			}
//		}
//		System.out.println(max);
//		for(int i=start;i<start+max;i++)
//		{
//			System.out.print(s.charAt(i));
//		}
//		
//
//	}
//
//}
