//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Toolkit;

class Tree extends Canvas
{
   public Tree()    //constructor method - sets up the class
   {
      setSize(1600,1000);
      setBackground(Color.WHITE); 
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.RED);
	  window.setFont(new Font("TAHOMA",Font.BOLD,36));
      window.drawString("MERRY CHRISTMAS ", 600, 45 );

      tree(window);
      
      //call other methods
      
   }

   public void tree( Graphics window )
   {
      window.setColor(Color.GREEN);

        int[] xPoints = {800, 500,1100};
		int[] yPoints = {100,750,750};
		int nPoints = 3;
		Polygon triangle = new Polygon(xPoints,yPoints,nPoints);

		window.fillPolygon(triangle);
		
		Color c=new Color(162,45,45);
		window.setColor(c);
		window.fillRect(775,750,50,100);

						
   }

   public void ornaments( Graphics window )
   {

		//add more code here
   }

   public void lights( Graphics window )
   {
	 window.setColor(Color.YELLOW);
	 window.drawOval(775,750,25,25);
   }
     public void misc( Graphics window )
   {

		//add more code here

   }
}