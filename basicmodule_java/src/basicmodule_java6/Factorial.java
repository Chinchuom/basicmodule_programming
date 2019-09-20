package basicmodule_java6;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args)
	{
		int num,temp=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter thed number of alphabets in your name");
		num=s.nextInt();
		while(num!=0)
		{
			temp=temp*num;
			num--;
		}
		System.out.println("The number of combination is"+temp);
	}
	

}
