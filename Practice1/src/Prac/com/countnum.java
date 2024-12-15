package Prac.com;

public class countnum {
	public static int countn(int num)
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
		int num=12;
		int res=countn(num);
		System.out.println(res);
		
		

	}

}
