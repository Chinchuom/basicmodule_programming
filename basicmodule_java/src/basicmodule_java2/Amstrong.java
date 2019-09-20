package basicmodule_java2;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
	//	int a=sc.nextInt();
		int t=num;
		int rem=0;
		int count=0;
		int b=0;
		
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		
		//System.out.println(count);
		while(num!=0)
		{
			rem=rem%10;
			int a=1;
			
			for(int i=0;i<count;i++)
			{
				a=a*rem;
				
			}
			b=b+a;
			num=num/10;
		}
		if(num==t)
		{
			System.out.println("The number is Amstrong");
		}
		else
		{
			System.out.println("The number  Not Amstrong");
		}
	}

}
