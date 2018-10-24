//© A+ Computer Science
// www.apluscompsci.com

//print/println example

public class Output_practice
{
	public static void main(String args[])
	{
		System.out.print("compsci");
		System.out.println();System.out.println();

		System.out.print("compsci");
		System.out.print("compsci");
		System.out.println();System.out.println();

		System.out.println("compsci");
		System.out.println();

		System.out.println("compsci");
		System.out.println("compsci");
		System.out.println();
		
		String lineFmt = "%10s\n\n";
		System.out.printf(lineFmt,"compsci");
		
		int num1=15;
		int num2=37;
		double total=num1+num2;
		String fmt="%5d\t+\t%5d\t=\t%5.2f\n\n";
		System.out.printf(fmt,num1,num2,total);
	
	
		/* Print out   JAVA
		 *              IS
		 *           AWESOME!!
		 *using one line of code.  (Be sure to use escape sequences) */
		 
		 System.out.printf("Java\n IS \n AWESOME \n");
		 
		/*Print out     JAVA
		 *               IS
		 *            AWESOME!!
		 *
		 *using multiple lines of code. 
		 */
		 
		 System.out.printf("Java");
		 System.out.printf("Is");
		 System.out.printf("Awesome");		
		  
		// define six integer variables -- number1, number2, sum, difference, product, and quotient


		int number1;
		int number2;
		int sum;
		int difference;
		int product;
		double quotient;


			
		// define three string variables -- first name, last name, and date of birth
			

		// assign the values 43 and 68 to the two number fields

		int val1 = 43;
		int val2 = 68;

		// assign your information to the string fields
		
		
		String name = "Farid";
		String last = "Kamizi";
		String dob = "Oct 12, 2000";		
		
		
		// calculate the sum, difference, product, and quotient using number1 and number2
		int nmber1 = 10;
		int nmber2 = 2;
		System.out.println(nmber1+nmber2);
		System.out.println(nmber1-nmber2);
		System.out.println(nmber1*nmber2);
		System.out.println(nmber1/nmber2);
		
		/* print 'The first number is 43
		 *        The second number is 68
		 *        The total of these two numbers is ??
		 *        The difference of these two numbers is ??
		 *        The product of these two numbers is ??
		 *        The quotient of these two numbers is ??' 
		 *
		 *   using strings and variables  */
		 
 /*Define and assign a name field that is equal to first name + last name 
		  *
		  *print the following statement --
		  *       My name is (name) and my birthday is (birthdate).
		  *
		  */
		 
	 
		 System.out.println("My name is " + name + " and my birthday is " + dob);
		 
	}
}