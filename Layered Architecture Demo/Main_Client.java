package layered_architecture;

import java.io.IOException;

public class Main_Client 
{
	public static void main(String[] args) throws IOException 
	{
		Test_Service t = new Test_Service();
		
		t.createData();
		t.displayDetails();
		t.addPerson();
		t.displayDetails();
		
		String checkPersonExistance = t.checkPersonExistance(1);
		System.out.println(checkPersonExistance);
		
		
	}
}
