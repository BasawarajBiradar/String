package practiseString;

public class HwQue33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="43521";
		char[]sa=s.toCharArray();
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i]>sa[j])
				{
					char temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		s=new String(sa);
		System.out.println(s);

	}

}
