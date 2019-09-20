package basicmodule_java5;
import java.util.Scanner;
public class Retest {
	public static void main(String[] args) {
		int num,max;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students");
		num=s.nextInt();
		System.out.println("Enter the maximum mark");
		max=s.nextInt();
		int marks[]=new int [(int)num];
		System.out.println("Enter the marks");
		for(int i=0;i<num;i++)
		{
			marks[i]=s.nextInt();
		}
		
		int temp=max/2;
		for(int i=0;i<num;i++) {
			if(marks[i]<temp)
			{
				count++;
			}
		}
		System.out.println("Number of students appearing for test is"+count);
	}

}
