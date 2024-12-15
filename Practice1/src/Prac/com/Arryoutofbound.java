package Prac.com;

public class Arryoutofbound {

	public static void main(String[] args) {
//		int[]arr=new int[5];
//		arr[0]=10;
//		arr[1]=10;
//		arr[2]=10;
//		arr[3]=10;
//		arr[4]=10;
//		try {
//			System.out.println(arr[9]);
//			
//		}catch(Exception e)
//		{
//			System.out.println("Array out of bound exception handled");
//		}  
//		System.out.println("Array out of bound exception");
		int[]arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=i;		
		}try {
			for(int i=0;i<10;i++)
			{
				System.out.println(arr[i]);		
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}


	}

}
