
public class LeasePaymentException extends Exception{
	double paymentAmount;
	AnnualLease theLease;
	String exceptionMessage;
	
	public LeasePaymentException(double anAmount,AnnualLease aLease){
		super("this is a custom LeasePaymentException\n");
		theLease= aLease;
		paymentAmount=anAmount;
		
		exceptionMessage="for lease starting"+theLease.getStartDate()+"\n with amount due"+ theLease.getBalanceDue()+"but payment made of"+anAmount;
	}
	
	public String 	toString(){
		return super.toString()+exceptionMessage;
	}
}
