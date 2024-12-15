package Prac.com;

public class perfectnums {
	public static int perfectnum(int num)
	{  
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				//System.out.println(i);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++)
		{
			int num=i;
			int res=perfectnum(num);
			if(num==res)
			{
				System.out.println("perfect num : "+res);
			}
//			else
//				System.out.println("it's not");
//	
		}
		
	}

}
