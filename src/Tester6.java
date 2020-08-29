
public class Tester6 {
	public static void main(String args[]){
		Slip firstSlip= null;
		try{
			firstSlip=new Slip(150,10,20);
			System.out.println(firstSlip.tellAboutSelf());
		}
		
		catch(Exception n){
			System.out.println(n);
		}
		
		try{
			firstSlip=new Slip(15,15,20);
			System.out.println(firstSlip.tellAboutSelf());
		}
		
		catch(Exception n){
			System.out.println(n);
		}
		finally 
		{	System.out.println("finally block is always executed");}
		
		try{
			firstSlip=new Slip(2,10,20);
			System.out.println(firstSlip.tellAboutSelf());
		}
		
		catch(Exception n){
			System.out.println(n);
		}
		finally 
		{	System.out.println("finally block is always executed");}
		
		
	}
}
