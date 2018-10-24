//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.*;
import java.io.*;
import javax.sound.sampled.*;

class Tree extends Canvas
{
   public Tree()    //constructor method - sets up the class
   {
      setSize(1600,1000);
      //setBackground(Color.WHITE); 
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

		//window.setColor(Color.YELLOW); yellow decorations
	 	//window.fillOval(775,750,25,25);	
	 	
	 	window.setColor(Color.YELLOW);
	 	window.drawLine(755,200,870,250);
	 	window.drawLine(870,250,705,300);
	 	window.drawLine(705,300,915,350);
	 	window.drawLine(915,350,660,400);
	 	window.drawLine(660,400,960,450);
	 	window.drawLine(960,450,610,500);
	 	window.drawLine(610,500,1010,550);
	 	window.drawLine(1010,550,570,600);
	 	window.drawLine(570,600,1055,650);
	 	window.drawLine(1055,650,520,700);
	 	window.drawLine(520,700,1100,750);	
	 	
	 	//grass
	 	window.setColor(Color.GREEN);				
		window.fillRect(0,850,1600,150);
		
}
   public void ornaments( Graphics window )
   {

		//add more code here
   }

   public void lights( Graphics window )
   {
   }
     public void misc( Graphics window )
   {

		//add more code here

   }
}