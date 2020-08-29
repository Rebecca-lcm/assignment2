import java.util.Vector;
import java.io.*;
public class CustomerDA 
{
	static Vector customers;
	static File customerFile= new File("D:/1/javaJDK/eclipse/Customer.dat");
	public static Customer find(String phoneNo) throws NotFoundException
	{
		Customer aCustomer = null;
		boolean foundIt = false;
		for(int i=0;i<customers.size()&&!foundIt;i++)
		{
			aCustomer = (Customer)customers.elementAt(i);
			if(phoneNo.equals(aCustomer.getPhoneNo()))   foundIt= true;
		}
		
		if (foundIt)  return aCustomer;
		else throw(new NotFoundException("not found"));
	}
	public static Vector getAll()
	{
		return customers;
	}
	public static void delete(Customer aCustomer) throws NotFoundException
	{
		String phoneNo = aCustomer.getPhoneNo();
		boolean foundIt = false;
		for(int i=0;i<customers.size()&&!foundIt;i++)
		{
			aCustomer = (Customer)customers.elementAt(i);
			if(phoneNo.equals(aCustomer.getPhoneNo()))  { foundIt= true;  customers.removeElementAt(i);}
		}
		if (!foundIt)  
		throw(new NotFoundException("not found"));
	}
	public static void update(Customer aCustomer) throws NotFoundException
	{}
	public static void addNew(Customer aCustomer) throws DuplicateException
	{
		boolean duplicate = false;
		for(int i=0;i<customers.size()&&!duplicate;i++)
		{
			Customer existingCustomer = (Customer)customers.elementAt(i);
			if(existingCustomer.getPhoneNo().equals(aCustomer.getPhoneNo()))   duplicate= true;
		}
		if (duplicate)  throw(new DuplicateException("Customer already exists"));
		else customers.add(aCustomer);
			
			
			
	}
	public static void initialize()
	{
		customers = new Vector();
		if(customerFile.exists()&&customerFile.length()!=0)
		{
			try
			{
				BufferedReader in = new BufferedReader(new FileReader(customerFile));
				String name,address,phoneNo;
				do
				{
					name= in.readLine();
					address= in.readLine();
					phoneNo= in.readLine();
					if(name!=null){customers.addElement(new Customer(name,address,phoneNo));}
				}while(phoneNo!=null);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void terminate()
	{
		try
		{
			PrintStream out = new PrintStream(new FileOutputStream(customerFile));
			for(int i=0;i<customers.size();i++)
			{
				Customer aCustomer = (Customer)customers.elementAt(i);
				out.println(aCustomer.getName());
				out.println(aCustomer.getAddress());
				out.println(aCustomer.getPhoneNo());
			}
		}
		catch(Exception e)
		{		System.out.println(e);	}
	}
}
