package Prac.com;

public class parc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print("-"+" ");
			}
			for(int j=a-i+1;j<=5;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			for(int j=a-1;j>=a-i+1;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		for(int i=5-1;i>=1;i--)
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print("-"+" ");
			}
			for(int j=a-i+1;j<=5;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			for(int j=a-1;j>=a-i+1;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}

	}

}
