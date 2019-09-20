package basicmodule_java;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args)
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		num=s.nextInt();
		if(num%400==0)
		{
			System.out.println("It is a leap year");	
		}
		else if(num%100==0)
		{
			System.out.println("It is a Leap yer");
		}
		else if(num%4==0)
		{
			System.out.println("It is a Leap year");
		}
		else
		{
			System.out.println("It is not a Leap year");
		}
	}

}
