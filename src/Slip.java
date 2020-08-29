
public class Slip {
	private int slipId;
	private int width;
	private double slipLength;
	
	private static final int DEFAULT_WIDTH=12;
	private static final int DEFAULT_SLIP_LENGTH=25;
	
	private static final int MAXIMUM_NUMBER_OF_SLIPS=50;
	private static final int VALID_SLIP_WIDTHS[]={10,12,14,16};
	
	private static int numberOfSlips=0;
	
	public Slip(int anId) throws Exception{
		this(anId,DEFAULT_WIDTH,DEFAULT_SLIP_LENGTH);
	}
	
	public Slip(int anId,int aWidth,double aSlipLength)throws Exception{
		setSlipId(anId);
		setWidth(aWidth);
		setSlipLength(aSlipLength);
		numberOfSlips++;
	}
	
	public double leaseSlip(){
		double fee;
		switch(width)
		{
		case 10: fee=800;break;
		case 12: fee=900;break;
		case 14: fee=1100;break;
		case 16: fee=1500;break;
		default: fee=0;break;
		}
		return fee;
	}
	
	public double leaseSlip(double aDiscountPercent){
		double fee= this.leaseSlip();
		double discountedFee=fee*(100-aDiscountPercent)/100;
		return discountedFee;
	}
	
	public void setSlipId(int anId)throws Exception
		{
		if(anId<1||anId>MAXIMUM_NUMBER_OF_SLIPS){
			Exception e= new Exception("Slip ID not between 1&"+MAXIMUM_NUMBER_OF_SLIPS);
			throw e;
			}
		else
		slipId=anId;
		}
	public void setWidth(int aWidth)throws Exception{
		boolean validWidth=false;
		for(int i=0;i<VALID_SLIP_WIDTHS.length&&!validWidth;i++){
			if(aWidth==VALID_SLIP_WIDTHS[i])
				validWidth=true;
		}
		if(validWidth)
		{width=aWidth;}
		else{
			Exception e= new Exception("Invalid Slip Width");
			throw e;
		}
	}
		
	public void setSlipLength(double aSlipLength)
		{slipLength=aSlipLength;}
	
	public int getSlipId()
		{return slipId;}
	public int getWidth()
		{return width;}
	public double getSlipLength()
		{return slipLength;}
	
	public static int getNumberOfSlips()
	{ return numberOfSlips;}
	
	public String tellAboutSelf(){
		String info;
		info="SlipId="+getSlipId()+"\nWidth="+getWidth()+"\nLength="+getSlipLength();
		return info;
	}
}
