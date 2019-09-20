package basicmodule_java9;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args)
	{
		int num,temp1=0,temp2=1,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		for(int i=0;i<=num;i++)
		{
			c=temp1+temp2;
			System.out.println(c);
			temp1=temp2;
			temp2=c;
		}
	}
}
