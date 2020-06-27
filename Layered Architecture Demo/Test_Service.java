package layered_architecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Test_Service 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Store_DAO s = null;
	static Details_Model d = null;
	public void createData() throws IOException 
	{
		s = new Store_DAO();
		System.out.println("Enter how many employees you want to add");
		int no = sc.nextInt(),i=1;
		while(no > 0)		//add automatically the objects first
		{
			System.out.println("For "+i);
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = br.readLine();
			d = new Details_Model(id, name);
			s.addDetails(d);
			i++;no--;
		}
	}
	public void displayDetails()
	{
		for (Details_Model details : s.display()) {
			System.out.println(details.getId()+"\t"+details.getName());
		}
	}
	public void addPerson() throws IOException
	{
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = br.readLine();
		d = new Details_Model(id, name);
		s.addPerson(d);
	}
	public String checkPersonExistance(int no)
	{
		for (Details_Model details : s.display()) {
			if(details.getId() == no)
				return details.getName()+" Person Exists";
		}
		return "Doesnt Exist";
	}
}
