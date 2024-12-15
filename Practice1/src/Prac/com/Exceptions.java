package Prac.com;
import java.util.*;

public class Exceptions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value a");
		int a=sc.nextInt();
		System.out.println("enter the value b");
		int b=sc.nextInt();
		try {
			int c=b/a;
			System.out.println(c);
			
		}catch(Exception e){
			System.out.println("exception handled");
			
		}
		System.out.println("main method is executed normally");

	}

}
