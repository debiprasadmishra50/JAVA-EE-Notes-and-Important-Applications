package layered_architecture;

import java.util.ArrayList;
import java.util.List;

public class Store_DAO 
{
	List<Details_Model> list = new ArrayList<Details_Model>();
	
	public void addDetails(Details_Model d)
	{
		list.add(d);
	}
	public List<Details_Model> display()
	{
		return list;
	}
	public void addPerson(Details_Model d)
	{
		list.add(d);
	}
}
