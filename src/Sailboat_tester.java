
public class Sailboat_tester {
	public static void main(String args[]){
		Sailboat firstBoat = new Sailboat("MO34561",28,"Tartan",1998,4.11,2,"Inboard Diesel");
		Powerboat secondBoat= new Powerboat("MO67891",30,"Bayliner",2001,2,"Gas");
	/*	System.out.println("Boat 1 information is:"+firstBoat.getStateRegistrationNo()+"\t"+firstBoat.getLength()+"\t"+firstBoat.getManufacturer()
				+"\t"+firstBoat.getYear()+"\t"+firstBoat.getKeelDepth()+"\t"+firstBoat.getNoSails()+"\t"+firstBoat.getMotorType());
		System.out.println("Boat 2 information is:"+secondBoat.getStateRegistrationNo()+"\t"+secondBoat.getLength()+"\t"+secondBoat.getManufacturer()
				+"\t"+secondBoat.getYear()+"\t"+secondBoat.getNoEngines()+"\t"+secondBoat.getFuelType());  */
		System.out.println(firstBoat.tellAboutSelf());
		System.out.println(secondBoat.tellAboutSelf());
	}
}
