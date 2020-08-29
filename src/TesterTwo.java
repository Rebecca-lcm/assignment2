
public class TesterTwo {
	public static void main(String args[]){
		Customer firstCustomer,secondCustomer,thirdCustomer;
		
		firstCustomer= new Customer("Eleanor","Atlanta","123-4567");
		
		String customerName,customerAddress,customerPhoneNo;
		
		customerName=firstCustomer.getName();
		customerAddress=firstCustomer.getAddress();
		customerPhoneNo=firstCustomer.getPhoneNo();
		
		System.out.println("The name is  "+customerName);
		System.out.println("The address is  "+customerAddress);
		System.out.println("The phone is  "+customerPhoneNo);
	}
}
