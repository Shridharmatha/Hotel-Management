package Prac.com;

public class prac6 {

	public static void main(String[] args) {
	int row =5;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=row-i;j++)
		{
			System.out.print("_"+" ");
		}
		for(int j=5;j>=row-i+1;j--)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}

	}

}
