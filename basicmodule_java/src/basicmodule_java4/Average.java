package basicmodule_java4;
import java.util.Scanner;
public class Average {
	public static void main(String[] args)
	{
		int num,temp=0;
		int avg;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		num=s.nextInt();
		int a[]=new int[(int)num];
		System.out.println("Enter the marks:");
		for(int i=0;i<num;i++)
		{
			a[i]=s.nextInt();	}
		for(int i=0;i<num;i++)
		{
			temp=temp+a[i];
		}
		avg=temp/num;
		
		System.out.println("The average is:"+avg);
	}

}
