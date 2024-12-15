package Prac.com;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int a=5;
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=(a-i);j++) {
		  System.out.print("-"+" ");      
	  }
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(j+" ");
		  }
		  for(int j=i-1;j>=1;j--) {
		  System.out.print(j+" ");

	}
		  System.out.println();

}
}
}
