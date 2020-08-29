import java.util.*;
public abstract class Lease {
	private Date startDate;
	private double amount;
	private Date endDate;
	
	public Lease(){
		
	}
	public Lease(Date aStartDate){
		setStartDate(aStartDate);
		setEndDate(null);
		setAmount(0);
	}
	
/*	public String tellAboutSelf(){
		String boatDetails;
		boatDetails=""+stateRegistrationNo+"\n"+length+"\n"+manufacturer+"\n"+year;
		return boatDetails;    
	}
	*/
	public abstract double calculateFee(int aLength);
	
	public void setAmount(double anAmount){
		amount=anAmount;
	}
	public void setStartDate(Date aStartDate){
		startDate=aStartDate;
	}
	public void setEndDate(Date anEndDate){
		endDate=anEndDate;
	}
	
	
	public double getAmount(){
		return amount;
	}
	public Date getStartDate(){
		return startDate;
	}
	public Date getEndDate(){
		return endDate;
	}

	
	
}
