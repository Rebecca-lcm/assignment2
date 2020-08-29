
public class Tester1 {
	public static void main(String args[]) throws Exception{
		Slip slips[]	=new Slip[3];
		slips[0]=new Slip(1,10,20);
		slips[1]=new Slip(2,12,25);
		slips[2]=new Slip(3,14,30);
		
		for(int i=0;i<slips.length;i++){
			System.out.println(slips [i].tellAboutSelf()+"\n");
		}
	}
}
