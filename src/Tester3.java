import java.text.*;
public class Tester3 {
	public static void main(String args[]) throws Exception{
	Slip aSlip = new Slip(3,14,30);
	
	double fee= aSlip.leaseSlip();
	
	NumberFormat currencyFormat= NumberFormat.getCurrencyInstance();
	System.out.println("Currency:"+ currencyFormat.format(fee));
	
	DecimalFormat decimalFormat = new DecimalFormat("##,##0.00");
	System.out.println("Decimal:"+ decimalFormat.format(fee));
	}
}
