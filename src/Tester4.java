
public class Tester4 {
	public static void main(String args[]) throws Exception{
		Slip slips[]	=new Slip[3];
		slips[0]=new Slip(1,10,20);
		System.out.println("Number of slips"+Slip.getNumberOfSlips());
		slips[1]=new Slip(2,12,25);
		System.out.println("Number of slips(ref var)"+slips[0].getNumberOfSlips());
		System.out.println("Number of slips"+Slip.getNumberOfSlips());
		slips[2]=new Slip(3,14,30);
		
		System.out.println("Number of slips"+Slip.getNumberOfSlips());
		
	}
}
