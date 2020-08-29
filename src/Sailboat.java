
public class Sailboat extends Boat{
	private double keelDepth;
	private String motorType;
	private int noSails;
	
	public Sailboat(String aStateRegistrationNo,double aLength,String aManufacturer,int aYear,double aKeelDepth,int aNoSails,String aMotorType){
		super(aStateRegistrationNo,aLength,aManufacturer,aYear);
		setKeelDepth(aKeelDepth);
		setNoSails(aNoSails);
		setMotorType(aMotorType);
	}
	
	public String tellAboutSelf(){
		String sailboatDetails;
		sailboatDetails="This is a sailboat\n"+getStateRegistrationNo()+"\n"+getLength()+"\n"+getManufacturer()+"\n"+getYear()+"\n"+getKeelDepth()
				+"\n"+getNoSails()+"\n"+getMotorType();
		return sailboatDetails;
	}
	
	public void setKeelDepth(double aKeelDepth){
		keelDepth=aKeelDepth;
	}
	public void setNoSails(int aNoSails){
		noSails=aNoSails;
	}
	public void setMotorType(String aMotorType){
		motorType=aMotorType;
	}
	
	
	public String getMotorType(){
		return motorType;
	}
	public double getKeelDepth(){
		return keelDepth;
	}
	public int getNoSails(){
		return noSails;
	}
	
	
}

