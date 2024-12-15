package Prac.com;

public class prac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=row-i+1;j<=5;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}

	}

}
