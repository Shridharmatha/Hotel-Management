package Prac.com;

public class parse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=8;
		int k=1;
    	int s=1;
    	int n=101;
    	int m=202;
    	for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(k<=9) {
				System.out.print(k+" ");
				k++;
			}else if(k>=10 && k<=18) {
				System.out.print(s*11+" ");
				s++;
				k++;
			
			}else if(k>=18 && k<=28)
			{
				System.out.print(n+" ");
				k++;
				n+=10;
			}else if(k>=28 && k<=36)
			{
				System.out.print(m+" ");
				k++;
				m+=10;
			}
    	}

			System.out.println();
		

	}

}
}
