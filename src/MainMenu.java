import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainMenu extends JFrame implements ActionListener
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JButton findCustomerButton, addCustomerButton, closeButton;
	
	public static void main(String[] args)
	{
		MainMenu frame=new MainMenu();
	}
	
	public MainMenu()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(2,1));
		JPanel lowerPanel = new JPanel();
		
		Font defaultFont = c.getFont();
		JLabel logoLabel = new JLabel("",SwingConstants.CENTER);
		logoLabel.setForeground(Color.red);
		logoLabel.setFont(new Font("TimesRoman",Font.ITALIC,36));
		logoLabel.setText("Bradshaw Marina");
		c.add(logoLabel);
		
		findCustomerButton = new JButton("Find a Customer");
		addCustomerButton = new JButton("Add a Customer");
		closeButton = new JButton("Close");
		lowerPanel.add(findCustomerButton);
		lowerPanel.add(addCustomerButton);
		lowerPanel.add(closeButton);
		c.add(lowerPanel);
		findCustomerButton.addActionListener(this);
		addCustomerButton.addActionListener(this);
		closeButton.addActionListener(this);
		this.setSize(300, 200);
		this.setTitle("Main Menu");
		this.setVisible(true);
		
	//	Customer.initialize();
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{shutDown();}
		});		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==findCustomerButton)  findCustomer();
		if(e.getSource()==addCustomerButton)   addCustomer();
		if(e.getSource()==closeButton) shutDown();
	//	if(e.getSource()==sailboatRadioButton) boatLayout.first(boatPanel);
	//	if(e.getSource()==powerboatRadioButton) boatLayout.last(boatPanel);		
	}
	
	private void findCustomer(){
		FindCustomer findCustomerFrame = new FindCustomer();
		findCustomerFrame.setSize(300, 200);
		findCustomerFrame.setTitle("Find A Customer");
		findCustomerFrame.setVisible(true);
		this.setVisible(false);
	}
	
	private void addCustomer(){
		AddCustomer addCustomerFrame = new AddCustomer();
		addCustomerFrame.setSize(300, 200);
		addCustomerFrame.setTitle("Add A Customer");
		addCustomerFrame.setVisible(true);
		this.setVisible(false);
	}
	
	public void shutDown()
	{
		System.exit(0);
	}
}
