package basicmodule_java3;
import java.util.Scanner;

public class Score {
public static void main(String[] args)
{int num,temp;
Scanner s= new Scanner(System.in);
System.out.println("Enter the number of students:");
num=s.nextInt();
int a[]=new int[(int) num];
System.out.println("Enter the mark of the students:");
for(int i=0;i<num;i++)
{
	a[i]=s.nextInt();	}
for(int i=0;i<num;i++) 
{
for(int j=i+1;j<num;j++)
{
	if(a[i]<a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}}}
System.out.println("The marks in highest order is:");
for(int i=0;i<num;i++)
{
System.out.println(a[i]);
}
	}

}
