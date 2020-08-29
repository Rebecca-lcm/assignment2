import java.util.*;
public class AnnualLease extends Lease {
	private double balanceDue;
	private boolean payMonthly;
	
	public AnnualLease(Date aStartDate,int aSlipWidth,boolean isPayMonthly){
		super(aStartDate);
		
		Calendar aCalendar = Calendar.getInstance();
		aCalendar.setTime(aStartDate);
		aCalendar.add(Calendar.YEAR, 1);
		
		setEndDate(aCalendar.getTime());
		
		setAmount(calculateFee(aSlipWidth));
		
		setPayMonthly(isPayMonthly);
		if(payMonthly)
			setBalanceDue(getAmount()-getAmount()/12);
		else	setBalanceDue(0);
	}
	
	public void recordLeasePayment(double anAmount)throws LeasePaymentException{
		if(anAmount>balanceDue){
			LeasePaymentException e= new LeasePaymentException(anAmount,this);
			throw e;	
		}
		else{
			balanceDue-=anAmount;
		}
		
	}
	
	public double calculateFee(int aWidth){
		double fee;
		switch(aWidth){
		case 10:fee=800;break;
		case 12:fee=900;break;
		case 14:fee=1100;break;
		case 16:fee=1500;break;
		default:fee=0;
		}
		return fee;
	}
	
	public void setPayMonthly(boolean isPayMonthly){
		payMonthly= isPayMonthly;
	}
	public void setBalanceDue(double anAmount){
		balanceDue= anAmount;
	}
	
	public boolean getPayMonthly(){
		return payMonthly;
	}
	public double getBalanceDue(){
		return balanceDue;
	}
}
