package practiseString;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class HwQue36 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="abcdefg";
		
		
		StringReader reader=new StringReader(s);
		int count=0;
		while(reader.read()!=-1)
		{
			count++;
		}
		System.out.println(count);
		
//		int i=0;
//		int count=0;
//		try {
//		while(true)
//		{
//			s1=s1+s.charAt(i);
//			count++;
//			i++;
//		}
//		}
//		catch (Exception e) {
//			System.out.println(count);
//		}
//		StringReader reader=new StringReader(s);
//		int count=0;
//			while((reader.read())!=-1)
//			{
//				count++;
//			}
//			
//			System.out.println(count);
		
		
		
		
		
		
	}

}
