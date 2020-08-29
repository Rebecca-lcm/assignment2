package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddCustomer extends JFrame implements ActionListener
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField customerNameText, customerAddressText, customerPhoneText;
	JButton addButton,clearButton,closeButton;
	Customer aCustomer;
	String customerName,customerAddress,customerPhone;
	
	public static void main(String args[])
	{
		AddCustomer frame=new AddCustomer();
	}
	
	public AddCustomer()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3,1));
		JPanel centerPanel = new JPanel(new GridLayout(3,2));
		JPanel lowerPanel = new JPanel(new FlowLayout());
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
