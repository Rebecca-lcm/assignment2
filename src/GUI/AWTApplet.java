package GUI;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class AWTApplet extends Applet implements
ActionListener
{	Button displayButton,clearButton;
	TextField messageTextField;


	public void init()
	{
	//	closeButton=new Button("Close");
		displayButton=new Button("Display");
		clearButton=new Button("Clear");
		Label messageLabel=new Label("Message:");
		messageTextField =new TextField(15);
		Panel upperPanel= new Panel();
		Panel lowerPanel= new Panel();
		upperPanel.add(messageLabel);
		upperPanel.add(messageTextField);
		lowerPanel.add(displayButton);
		lowerPanel.add(clearButton);
		//lowerPanel.add(closeButton);
		this.add("North",upperPanel);
		this.add("South",lowerPanel);
		displayButton.addActionListener(this);
		clearButton.addActionListener(this);
		//closeButton.addActionListener(this);
		
	//	this.setLayout(new FlowLayout());
	//  this.add(closeButton);
	/*	this.setSize(300,150);
		this.setTitle("AWT Frame With A Button");
		this.setVisible(true);
		//closeButton.addActionListener(this);
		//WindowCloser eventHandler=new WindowCloser(this);
		//this.addWindowListener(eventHandler);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{shutDown();}
		});             */
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==displayButton)  displayMessage();
		if(e.getSource()==clearButton)  clearMessage();
		//if(e.getSource()==closeButton) 
		//shutDown();
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
	/*public void shutDown()
	{
		this.dispose();
		System.exit(0);
	}   */
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

