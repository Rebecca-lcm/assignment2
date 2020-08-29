
public class TesterOne {
	public static void main(String args[]){
		Customer firstCustomer=new Customer();
		
		firstCustomer.setName("Eleanor");
		firstCustomer.setAddress("Atlanta");
		firstCustomer.setPhoneNo("12345678");
		
		String customerName,customerAddress,customerPhoneNo;
		
		customerName=firstCustomer.getName();
		customerAddress=firstCustomer.getAddress();
		customerPhoneNo=firstCustomer.getPhoneNo();
		
		System.out.println("The name is  "+customerName);
		System.out.println("The address is  "+customerAddress);
		System.out.println("The phone is  "+customerPhoneNo);
	}
}
