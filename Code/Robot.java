//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
     
      window.setColor(Color.GREEN);
      window.fillOval( 340, 125, 25, 25);
      window.fillOval( 430, 125, 25, 25);
      
      window.setColor(Color.BLACK);
      window.fillArc(385,150,25,15,0,360);
      
      window.setColor(Color.RED);
      window.drawArc(350,165,100,25,0,-180);      			
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.BLUE);
	  window.fillRect(320,220,150,100);	
	  
	  window.setColor(Color.BLACK);
	  window.drawLine(250,175,320,220);
	  window.drawLine(540,175,470,220);
	  
   }

   public void lowerBody( Graphics window )
   {
      window.setColor(Color.GRAY);
	  window.fillRect(320,350,150,100);	
	  
	  window.setColor(Color.BLACK);
	  window.drawLine(250,500,320,450);
	  window.drawLine(540,500,470,450);
   }
}