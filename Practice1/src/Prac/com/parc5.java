package Prac.com;

public class parc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int k=0;
		for(int i=1;i<=row;i++)
		{
			 k=i;
			for(int j=1;j<=row;j++)
			{
				if(i==1||i==row||j==1||j==row)
				{
					System.out.print(k+" ");
					k++;
				}
				else
				System.out.print(" "+" ");
				
			}
			System.out.println();
			//k++;
		}

	}

}
