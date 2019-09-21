package case_study4;
import java.util.Scanner;
public class Email2 {
	public static void main(String[] args)
	{int i=0;
	Scanner s=new Scanner(System.in);
	String name;
	String email;
	String address;
	String contact_number;
	String prooftype;
	String proofID;
	String n;
	String a; 
	
	do
	{
		System.out.println("Registration");
		i++;
		System.out.println("Enter your name:");
		name=s.nextLine();
		System.out.println("Enter your address:");
		address=s.nextLine();
		System.out.println("Contact number:");
		contact_number=s.nextLine();
		System.out.println("E-Mail ID:");
		email=s.nextLine();
		System.out.println("Enter proof type:");
		prooftype=s.nextLine();
		System.out.println("Enter proof ID:");
		proofID=s.nextLine();
		System.out.println("Thank you for registering. Your ID is "+i+"..");
		System.out.println("Do you want to continue registration?(y/n)");
		n=s.nextLine();
		
	}
	while(n.equalsIgnoreCase("yes"));
			{
		System.out.println("Do you want to update email?");
		
		a=s.nextLine();
		
		while(a.equalsIgnoreCase("yes"));
		{
			System.out.println("Update email:");
			System.out.println("Enter newEmail ID:");
			email=s.nextLine();
			System.out.println("Email updated:");
			System.out.println("Your Details are as follows");
			System.out.println("Name:"+name);
			System.out.println("Address:"+address);
			System.out.println("Email_ID:"+email);
			System.out.println("Contact Number:"+contact_number);
			System.out.println("Proof Type:"+ prooftype);
			System.out.println("Proof ID:"+ proofID);
			System.exit(0);
		}
		
			}
	}

}
