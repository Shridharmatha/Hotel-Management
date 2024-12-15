package Prac.com;

public class parse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=i;j>=2;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}
	

}
