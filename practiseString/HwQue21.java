package practiseString;

public class HwQue21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aababcdabcdefabcdegfh";
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
		int[]dc=new int[unique.length()];
		char[]ua=unique.toCharArray();
		for(int i=0;i<unique.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(unique.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			dc[i]=count;
		}
		for(int i=0;i<ua.length;i++)
		{
			for(int j=i+1;j<ua.length;j++)
			{
				if(dc[i]>dc[j])
				{
					int temp=dc[i];
					dc[i]=dc[j];
					dc[j]=temp;
					
					char tempchar=ua[i];
					ua[i]=ua[j];
					ua[j]=tempchar;
				}
			}
		}
//		System.out.println(Arrays.toString(dc));
//		System.out.println(Arrays.toString(ua));
		System.out.println("second most frequent character in string is "+ua[ua.length-2]);


	}

}
