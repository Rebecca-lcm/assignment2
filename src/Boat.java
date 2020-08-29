
public class Boat {
	private String stateRegistrationNo;
	private double length;
	private String manufacturer;
	private int year;
	private Customer customer;
	
	public Boat(){
		
	}
	public Boat(String aStateRegistrationNo,double aLength,String aManufacturer,int aYear){
		setStateRegistrationNo(aStateRegistrationNo);
		setLength(aLength);
		setManufacturer(aManufacturer);
		setYear(aYear);
		setCustomer(null);
	}
	
	public void assignBoatToCustomer(Customer aCustomer)
	{
		setCustomer(aCustomer);
		customer.setBoat(this);
	}
	
	public String tellAboutSelf(){
		String boatDetails;
		boatDetails=""+stateRegistrationNo+"\n"+length+"\n"+manufacturer+"\n"+year;
		return boatDetails;
	}
	
	public void setStateRegistrationNo(String aStateRegistrationNo){
		stateRegistrationNo=aStateRegistrationNo;
	}
	public void setLength(double aLength){
		length=aLength;
	}
	public void setManufacturer(String aManufacturer){
		manufacturer=aManufacturer;
	}
	public void setYear(int aYear){
		year= aYear;
	}
	public void setCustomer(Customer aCustomer){
		customer= aCustomer;
	}
	
	public String getStateRegistrationNo(){
		return stateRegistrationNo;
	}
	public double getLength(){
		return length;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public int getYear(){
		return year;
	}
	public Customer getCustomer(){
		return customer;
	}
	
}

