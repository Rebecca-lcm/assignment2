
public class Powerboat extends Boat{
	private String fuelType;
	private int noEngines;
	
	public Powerboat(String aStateRegistrationNo,double aLength,String aManufacturer,int aYear,int aNoEngines,String aFuelType){
		super(aStateRegistrationNo,aLength,aManufacturer,aYear);
		setNoEngines(aNoEngines);
		setFuelType(aFuelType);
	}
	
	public String tellAboutSelf(){
		String powerboatDetails;
		powerboatDetails="This is a powerboat\n"+super.tellAboutSelf()
				+"\n"+getNoEngines()+"\n"+getFuelType();
		return powerboatDetails;
	}
	
	public void setNoEngines(int aNoEngines){
		noEngines=aNoEngines;
	}
	public void setFuelType(String aFuelType){
		fuelType=aFuelType;
	}
	
	
	public String getFuelType(){
		return fuelType;
	}
	public int getNoEngines(){
		return noEngines;
	}
	
	
}
