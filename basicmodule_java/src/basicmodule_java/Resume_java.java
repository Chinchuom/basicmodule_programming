package basicmodule_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resume_java {
	String name;
	String age;
	String degree;
	String branch;
	String contact_number;
	
	public Resume_java(String name,String age,String degree,String branch,String contact_number)
	{
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.branch=branch;
		this.contact_number=contact_number;
	}
	public static void main(String[] args) throws IOException
	{
		String name;
		String age;
		String degree;
		String branch;
		String contact_number;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		name=br.readLine();
		age=br.readLine();
		degree=br.readLine();
		branch=br.readLine();
		contact_number=br.readLine();
		
		Resume_java basicmodule_java=new Resume_java(name,age,degree,branch,contact_number);
		basicmodule_java.register(name,age,degree,branch,contact_number);
	}

	private void register(String name2, String age2, String degree2, String branch2, String contact_number2) {
		// TODO Auto-generated method stub
			System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Degree:"+degree);
		System.out.println("Branch:"+branch);
		System.out.println("Contact number:"+contact_number);
		
	}
}
