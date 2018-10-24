//(c) A+ Computer Science
//www.apluscompsci.com

//class complete worksheet key

import static java.lang.System.*;    

class Table
{
   private int upperBound;
   private int multiplier;

   public Table(int bound, int mult)
   {
    upperBound=bound;
    multiplier=mult;
   }	              
 
   public void setNums(int bound, int mult)
   {
    upperBound=bound;
    multiplier=mult;
   }	              
   
   public void print()
   {  
	for (int x=1; x <= upperBound; x++) 
	{
		System.out.println(x + " - " + x * multiplier);
	}
   }  
}

public class ClassCompleteWorkSheet3
{
   public static void main(String args[])
   {
		Table table = new Table(10,5);
		table.print();
		
		//add two additional charts
		
   }
}