package Prac.com;

public class armstrongnum {
	public static int c_armstrongnum(int num)
	{
		int digit=c_digit(num);
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			res=(int)Math.pow(rem,digit)+res;
			num=num/10;
			
		}
		return res;
	}
	public static int c_digit(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		for(int i=1;i<=1000;i++)
		{
			int num=i;
			int res=c_armstrongnum(num);
			//System.out.println(res);
			if(num==res)
			{
				
				System.out.println("armstrong num : "+res);
				sum=sum+num;
				count++;
		}
			if(count==12)
			{
				System.out.println("sum of the armstrong numbers : "+sum);
				break;
			}

	}

}
}
