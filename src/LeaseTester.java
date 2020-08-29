import java.util.*;
public class LeaseTester {
	public static void main(String args[]){
		Calendar aCalendar = Calendar.getInstance();
		
		aCalendar.set(2003, Calendar.AUGUST, 28);
		Date date1= aCalendar.getTime();
		
		aCalendar.set(2003, Calendar.SEPTEMBER, 3);
		Date date2 =aCalendar.getTime();
		
		aCalendar.set(2003, Calendar.SEPTEMBER, 7);
		Date date3 =aCalendar.getTime();
		
		AnnualLease firstLease = new AnnualLease(date1,14,true);
		AnnualLease secondLease = new AnnualLease(date2,16,false);
		DailyLease thirdLease = new DailyLease(date1,date2,14);
		DailyLease fourthLease = new DailyLease(date2,date3,16);
		
		System.out.println("AnnualLease 1 information is:"+firstLease.getAmount()+"\t"+firstLease.getStartDate()+"\t"+firstLease.getEndDate()
				+"\t"+firstLease.getBalanceDue()+"\t"+firstLease.getPayMonthly());
		System.out.println("AnnualLease 2 information is:"+secondLease.getAmount()+"\t"+secondLease.getStartDate()+"\t"+secondLease.getEndDate()
				+"\t"+secondLease.getBalanceDue()+"\t"+secondLease.getPayMonthly());
		System.out.println(thirdLease.tellAboutSelf());
		System.out.println(fourthLease.tellAboutSelf());
	}
}
