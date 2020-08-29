
public class Tester5 {
	public static void main(String args[]) throws Exception{
		Slip firstSlip= new Slip(1,10,20);
		
		Slip secondSlip= new Slip(2);
		
		System.out.println(firstSlip.tellAboutSelf());
		System.out.println(secondSlip.tellAboutSelf());
		
		System.out.println("Slip 1 fee is "+firstSlip.leaseSlip());
		System.out.println("With 10% discount is "+firstSlip.leaseSlip(10));
		System.out.println("Slip 2 fee is "+secondSlip.leaseSlip());
		System.out.println("With 20% discount is "+secondSlip.leaseSlip(20));
	}
}
