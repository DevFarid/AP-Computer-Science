//© A+ Computer Science  -  www.apluscompsci.com

//class quiz key

import static java.lang.System.*;

class Buggy   
{
   private int width, height, speed;

   public Buggy(){
     
   }
   public Buggy(int w, int h){
    width=w;
    height=h;
   }
   public Buggy(int w, int h, int spd){
    width=w;
    height=h;
    speed=spd;
   }
   
   public int getWidth() {
   	return width;
   }   
   	
   public int getHeight() {
   	return height;
   }  
   	 
   public int getSpeed() {
   	return speed;
   }
   
   public boolean equals(Buggy obj){
    if((obj.getWidth() == getWidth()) && (obj.getHeight() == getHeight()) && (obj.getSpeed() == getSpeed())) {
    	return true;
    }
		return false;
   }
   public String toString()
   {
     return getWidth() + " " + getHeight() + " " + getSpeed() + " ";
   }  
}


class ClassQuiz2KEYB
{
   public static void main(String args[])
   {
		Buggy a = new Buggy();
		out.println("Buggy a:  " + a);
		
		Buggy b = new Buggy(2, 3);
		out.println("Buggy b:  " + b);	
		
		Buggy c = new Buggy(5, 6, 7);
		out.println("Buggy c:  " + c);	
			
		Buggy d = new Buggy(2, 3, 0);
		out.println("Buggy d:  " + d);	
			
		if(a.equals(b)) {
			out.println("Buggy a is equal to b.");		
		}
		else {
			out.println("Buggy a is NOT equal to b.");	
		}
		if(b.equals(c)) {
			out.println("Buggy b is equal to c.");
		}
		else {
			out.println("Buggy b is NOT equal to c.");	
		}
		if(c.equals(d)) {
			out.println("Buggy c is equal to d.");
		}
		else {
			out.println("Buggy c is NOT equal to d.");	
		}
		if(d.equals(a)) {
			out.println("Buggy d is equal to a.");
		}
		else {
			out.println("Buggy d is NOT equal to a.");	
		}
	
	
   }
}