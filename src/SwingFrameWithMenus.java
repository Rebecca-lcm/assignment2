
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingFrameWithMenus  extends JFrame implements
ActionListener
{
//	JButton displayButton,clearButton,closeButton;
	JTextField messageTextField;
	JMenuItem displayMenu,clearMenu,closeMenu;
	public static void main(String args[])
    {	SwingFrameWithMenus frame=new SwingFrameWithMenus();
	}

	public SwingFrameWithMenus()
	{
		//closeButton=new JButton("Close");
	//	displayButton=new JButton("Display");
	//	clearButton=new JButton("Clear");
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu ("File");
		JMenu helpMenu = new JMenu ("Help");
		displayMenu =new JMenuItem("Display");
		clearMenu =new JMenuItem("Clear");
		closeMenu =new JMenuItem("Close");
		fileMenu.setMnemonic('F');
		helpMenu.setMnemonic('H');
		
		this.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		fileMenu.add(displayMenu);
		fileMenu.add(clearMenu);
		fileMenu.add(closeMenu);

		JLabel messageLabel=new JLabel("Message:");
		messageTextField =new JTextField(15);
/*		JPanel upperPanel= new JPanel();
		JPanel lowerPanel= new JPanel();
		upperPanel.add(messageLabel);
		upperPanel.add(messageTextField);
		lowerPanel.add(displayButton);
		lowerPanel.add(clearButton);
		lowerPanel.add(closeButton);    */
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(messageLabel);
		c.add(messageTextField);
		displayMenu.addActionListener(this);
		clearMenu.addActionListener(this);
		closeMenu.addActionListener(this);
		
	//	this.setLayout(new FlowLayout());
	//  this.add(closeButton);
		this.setSize(320,150);
		this.setTitle("Swing Frame With Menus");
		this.setVisible(true);
		//closeButton.addActionListener(this);
		//WindowCloser eventHandler=new WindowCloser(this);
		//this.addWindowListener(eventHandler);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{shutDown();}
		});
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==displayMenu)  displayMessage();
		if(e.getSource()==clearMenu)  clearMessage();
		if(e.getSource()==closeMenu) 
		shutDown();
	}
	/*public void windowClosing(WindowEvent event)
	{
		shutDown();
	}
	
	public void windowClosed(WindowEvent event){}
	public void windowClosed(WindowEvent event){}
	public void windowClosed(WindowEvent event){}
	public void windowClosed(WindowEvent event){}
	public void windowClosed(WindowEvent event){}
	public void windowClosed(WindowEvent event){}*/
	
	public void displayMessage()
	{
		messageTextField.setText("Hello World");
	}
	public void clearMessage()
	{
		messageTextField.setText("            ");
	}
	public void shutDown()
	{
		this.dispose();
		System.exit(0);
	}
}

/*	class WindowCloser extends WindowAdapter
	{
		AWTFrameWithAButton frameToClose;
		public WindowCloser(AWTFrameWithAButton frame)
		{
			frameToClose= frame;
		}
		public void windowClosing(WindowEvent event)
		{
			frameToClose.shutDown();
		}
	}   */

