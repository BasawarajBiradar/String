package practiseString;

import java.io.IOException;
import java.io.StringReader;

public class LengthMethod {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String s="abcdefg";

//		StringReader reader=new StringReader(s);
//		int count=0;
//		while(true)
//		{
//			if(reader.read()==-1)
//			{
//				break;
//			}
//			
//			count++;
//			
//		}
//		System.out.println(count);
		
	
		
		
		StringReader r=new StringReader(s);
		int i=0;
		int count=0;
		while(r.read()!=-1)
        {
			count++;
        }
		System.out.println("length of string = "+count);

	}

}
