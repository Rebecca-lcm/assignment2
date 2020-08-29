package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingFrameAndComponent  extends JFrame implements
ActionListener
{
	JButton displayButton,clearButton,closeButton;
	JTextField messageTextField;
	public static void main(String args[])
    {	SwingFrameAndComponent frameAndComponent=new SwingFrameAndComponent();
	}

	public SwingFrameAndComponent()
	{
		closeButton=new JButton("Close");
		displayButton=new JButton("Display");
		clearButton=new JButton("Clear");
		JLabel messageLabel=new JLabel("Message:");
		messageTextField =new JTextField(15);
		JPanel upperPanel= new JPanel();
		JPanel lowerPanel= new JPanel();
		upperPanel.add(messageLabel);
		upperPanel.add(messageTextField);
		lowerPanel.add(displayButton);
		lowerPanel.add(clearButton);
		lowerPanel.add(closeButton);
		Container c=this.getContentPane();
		c.add("North",upperPanel);
		c.add("South",lowerPanel);
		displayButton.addActionListener(this);
		clearButton.addActionListener(this);
		closeButton.addActionListener(this);
		
	//	this.setLayout(new FlowLayout());
	//  this.add(closeButton);
		this.setSize(320,150);
		this.setTitle("Swing Frame And Components");
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
		if(e.getSource()==displayButton)  displayMessage();
		if(e.getSource()==clearButton)  clearMessage();
		if(e.getSource()==closeButton) 
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

