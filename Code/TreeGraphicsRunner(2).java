//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TreeGraphicsRunner extends JFrame
{
	private static final int WIDTH = 1600;
	private static final int HEIGHT = 1000;

	public TreeGraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);
		
		getContentPane().add(new Tree());
		
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		TreeGraphicsRunner run = new TreeGraphicsRunner();
	}
}