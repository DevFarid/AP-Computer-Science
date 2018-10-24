//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.*;
import java.awt.*;
import java.net.*;

public class TreeGraphicsRunner extends JFrame
{
	private static final int WIDTH = 1600;
	private static final int HEIGHT = 1000;	

	public TreeGraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);
		
	    //ImageIcon icon = new ImageIcon("C:\\Users\\calvinc\\Downloads\\xmas.gif");
	    //JLabel label=new JLabel(icon);
	    //setLayout(new BorderLayout());
	   	//add(label,BorderLayout.CENTER);
	    //setLocationRelativeTo(null);
	    //setOpacity(0.5f);
	    //setAlwaysOnTop(true);
	    //label.setOpaque(false);
	    //pack();	
		
		getContentPane().add(new Tree());
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		TreeGraphicsRunner run = new TreeGraphicsRunner();	
	}
}