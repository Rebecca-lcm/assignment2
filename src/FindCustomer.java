
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class FindCustomer extends JFrame implements ActionListener
{
	Vector customers,customerNames;
	JList customerList;
	JTextField customerNameText,customerAddressText,customerPhoneText;
	JButton findButton,updateButton,closeButton;
	Customer aCustomer;
	//String customerName,customerAddress,customerPhone;
	
	public static void main(String args[])
	{
		FindCustomer frame=new FindCustomer();
	}
	
	public FindCustomer()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3,1));
		JPanel centerPanel = new JPanel(new GridLayout(1,2));
		JPanel centerRightPanel = new JPanel(new GridLayout(2,1));
		JPanel lowerPanel = new JPanel(new FlowLayout());
		
		JLabel logoLabel = new JLabel("",SwingConstants.CENTER);
		logoLabel.setForeground(Color.red);
		logoLabel.setFont(new Font("TimesRoman",Font.ITALIC,36));
		logoLabel.setText("Bradshaw Marina");
		c.add(logoLabel);
		
		this.createCustomers();
		customerNames = new Vector();
		for(int i=0;i<customers.size();i++)
		{
			aCustomer = (Customer)customers.get(i);
			String customerName = aCustomer.getName();
			customerNames.add(customerName);
		}
		
		customerList = new JList(customerNames);
		JScrollPane scrollPaneCustomerList = new JScrollPane(customerList);
		
		//customerNameText = new JTextField();
		customerAddressText = new JTextField();
		customerPhoneText = new JTextField();
		
		centerPanel.add(scrollPaneCustomerList);
		centerRightPanel.add(customerAddressText);
		centerRightPanel.add(customerPhoneText);
		centerPanel.add(centerRightPanel);
		c.add(centerPanel);
		/*centerPanel.add(new JLabel("Address:",SwingConstants.RIGHT));
		centerPanel.add(customerAddressText);
		centerPanel.add(new JLabel("Phone:",SwingConstants.RIGHT));
		centerPanel.add(customerPhoneText);
		c.add(centerPanel);   */
		
		findButton = new JButton("Find");
		updateButton = new JButton("Update");
		closeButton = new JButton("Close");
		
		lowerPanel.add(findButton);
		lowerPanel.add(updateButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);
		
		findButton.addActionListener(this);
		updateButton.addActionListener(this);
		closeButton.addActionListener(this);
		
		this.setSize(300, 200);
		this.setTitle("Find A Customer");
		this.setVisible(true);
		
		
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{shutDown();}
		});	
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==findButton)  findCustomer();
		if(e.getSource()==updateButton)  updateCustomer();
		if(e.getSource()==closeButton) 
		shutDown();
	}
	
	private void findCustomer()
	{
		int i = customerList.getSelectedIndex();
		aCustomer = (Customer)customers.get(i);
		customerAddressText.setText(aCustomer.getAddress());
		customerPhoneText.setText(aCustomer.getPhoneNo());
	}
	
	private void updateCustomer()
	{
		int i = customerList.getSelectedIndex();
		aCustomer = (Customer)customers.get(i);
		aCustomer.setAddress(customerAddressText.getText());
		aCustomer.setPhoneNo(customerPhoneText.getText());
	}
	
	public void shutDown()
	{
		System.exit(0);
	}
	
	private void createCustomers()
	{
		customers = new Vector();
		customers.add(new Customer("E","A","123"));
		customers.add(new Customer("M","B","467"));
		customers.add(new Customer("J","S","765"));
		customers.add(new Customer("DA","A","321"));
		customers.add(new Customer("B","B","457"));
		customers.add(new Customer("DAN","S","587"));
	}
}


