import java.util.*;
public class TesterFour_Exception {
	public static void main(String args[]){
		Calendar aCalendar = Calendar.getInstance();
		
		aCalendar.set(2003, Calendar.AUGUST, 28);
		Date date1= aCalendar.getTime();
		
		AnnualLease firstLease= new AnnualLease(date1,14,true);
		
		try{
			firstLease.recordLeasePayment(1200.00);
		}
		catch(LeasePaymentException e){
			System.out.println(e.toString());
		}
	}
}
