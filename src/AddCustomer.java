
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddCustomer extends JFrame implements ActionListener
{
	JTextField customerNameText,customerAddressText,customerPhoneText;
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
		
		JLabel logoLabel = new JLabel("",SwingConstants.CENTER);
		logoLabel.setForeground(Color.red);
		logoLabel.setFont(new Font("TimesRoman",Font.ITALIC,36));
		logoLabel.setText("Bradshaw Marina");
		c.add(logoLabel);
		
		customerNameText = new JTextField();
		customerAddressText = new JTextField();
		customerPhoneText = new JTextField();
		
		centerPanel.add(new JLabel("Name:",SwingConstants.RIGHT));
		centerPanel.add(customerNameText);
		centerPanel.add(new JLabel("Address:",SwingConstants.RIGHT));
		centerPanel.add(customerAddressText);
		centerPanel.add(new JLabel("Phone:",SwingConstants.RIGHT));
		centerPanel.add(customerPhoneText);
		c.add(centerPanel);
		
		addButton = new JButton("Add");
		clearButton = new JButton("Clear");
		closeButton = new JButton("Close");
		
		lowerPanel.add(addButton);
		lowerPanel.add(clearButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);
		
		addButton.addActionListener(this);
		clearButton.addActionListener(this);
		closeButton.addActionListener(this);
		
		this.setSize(300, 200);
		this.setTitle("Add A Customer");
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{shutDown();}
		});	
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==addButton)  addCustomer();
		if(e.getSource()==clearButton)  clearForm();
		if(e.getSource()==closeButton) 
		shutDown();
	}
	
	private void addCustomer()
	{
		customerName = customerNameText.getText();
		customerAddress = customerAddressText.getText();
		customerPhone = customerPhoneText.getText();
		
		if(customerName.length()==0||customerAddress.length()==0||customerPhone.length()==0)
		{
			JOptionPane.showMessageDialog(this, "Please Enter All Date");
		}
		else
		{
			aCustomer = new Customer(customerName,customerAddress,customerPhone);
			JOptionPane.showMessageDialog(this, "Customer Added");
			clearForm();
		}
	}
	
	private void clearForm()
	{
		customerNameText.setText("");
		customerAddressText.setText("");
		customerPhoneText.setText("");
		customerNameText.requestFocus();
	}
	
	public void shutDown()
	{
		System.exit(0);
	}
}
