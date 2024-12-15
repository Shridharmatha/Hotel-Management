package Prac.com;

public class parc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int row=69;
		int a=5;
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=a-i;j++)
//			{
//				System.out.print("-"+" ");
//			}
//			for(int j=row-(a-i);j>=65;j--)
//			{
//				System.out.print((char)j+" ");
//			}
//			for(int j=66;j<=row-(a-i);j++)
//			{
//				System.out.print((char)j+" ");
//			}
			//System.out.println();
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print("-"+" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
	}

	}

}
