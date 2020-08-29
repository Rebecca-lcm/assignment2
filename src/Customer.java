import java.util.Vector;


public class Customer {
	private String name;
	private String address;
	private String phoneNo;
	
	private Boat boat;
	//Vector customers;
	public String getName()
		{return name;}
	public String getAddress()
		{return address;}
	public String getPhoneNo()
		{return phoneNo;}
	public Boat getBoat()
	{return boat;}
	
	public void setName(String newName)
	{ name=newName;}
	public void setAddress(String newAddress)
	{ address=newAddress;}
	public void setPhoneNo(String newPhoneNo)
	{ phoneNo=newPhoneNo;}
	public void setBoat(Boat aBoat)
	{ boat=aBoat;}
	
	public Customer(){
		
	}
	
	public Customer(String aName,String anAddress,String aPhoneNo){
		name=aName;
		address=anAddress;
		phoneNo=aPhoneNo;
		setBoat(null);
		
	}
	
	public String tellAboutSelf(){
		String info;
		info="Customer name="+getName()+"\nAddress="+getAddress()+"\nPhone Number="+getPhoneNo();
		return info;
	}
	
	/*public static void initialize()
	{
		customers =new Vector();
		
	}*/
}
