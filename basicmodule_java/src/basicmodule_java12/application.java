package basicmodule_java12;
import java.util.Scanner;
public class application {
public static void main(String[] args) 
{
int num,temp=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
num=s.nextInt();

int a[]=new int[(int)num];
System.out.println("Enter the runs considered by the bowlers:");
for(int i=0;i<num;i++)
{
	a[i]=s.nextInt();
}
for(int i=0;i<num;i++)
{
	for(int j=i+1;j<num;j++)
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}}
System.out.println(a[j]);
}
}
