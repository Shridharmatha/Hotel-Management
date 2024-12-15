package Prac.com;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=69;
//		  for(int i=65;i<=69;i++)
//		  {
//			  for(int j=65;j<=(a-i);j++) {
//			  System.out.print("-"+" ");      
//		  }
//			  for(int j=65;j<=134-i;j++)
//			  {
//				  System.out.print(j+" ");
//			  }
//			  for(int j=134-i;j>=69-i;j--) {
//			  System.out.print(j+" ");
//
//		}
//			  System.out.println();
//
//	}
		
		int row=69;
		int n=5;
		for(int i=1;i<=5;i++)
		{
		for (int j=0;j<n-i;j++) {
			System.out.print(" "+" ");
		}
	
		for(int j=row-i+1;j<=row;j++)  //for(int j=row-i+1;j<=5;j++)
		{
			System.out.print((char)j+" ");
		}

		for(int j=68;j>=row-i+1;j--)//for(int j=1;j<=row-i;j++)
		{
			System.out.print((char)j+" ");
		}
		System.out.println();
		
	}

}
}
