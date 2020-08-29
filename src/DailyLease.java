import java.util.*;
public class DailyLease extends Lease implements LeaseInterface,CompanyInterface{
	private int numberOfDays;
	
	
	public DailyLease(Date aStartDate,Date anEndDate,int aSlipWidth){
		super(aStartDate);
		
		Calendar aCalendar = Calendar.getInstance();
		aCalendar.setTime(aStartDate);
		int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
		
		aCalendar.setTime(anEndDate);
		int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
		
		setNumberOfDays(day2-day1);
		setEndDate(anEndDate);
		
		setAmount(calculateFee(aSlipWidth));
		
		
	}
	
		public String tellAboutSelf(){
			return "This is a daily lease for"+numberOfDays+"days for company"+	COMPANY_NAME+"located at"+COMPANY_ADDRESS;    
		}

	
	public double calculateFee(int aWidth){
		double fee;
		switch(aWidth){
		case 10:fee=20*getNumberOfDays();break;
		case 12:fee=25*getNumberOfDays();break;
		case 14:fee=30*getNumberOfDays();break;
		case 16:fee=35*getNumberOfDays();break;
		default:fee=0;
		}
		return fee;
	}
	
	public void setNumberOfDays(int aNumberOfDays){
		numberOfDays= aNumberOfDays;
	}

	public int getNumberOfDays(){
		return numberOfDays;
	}
	
}
