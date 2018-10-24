/**
 * @(#)inputPractice.java
 *
 *
 * @author 
 * @version 1.00 2014/9/15
 */

import java.util.Scanner; 

public class inputPrintFormatRefresher
{
	public static void main (String[] args)
	{
		// initiate a scanner named tribe
	
		
		Scanner tribe = new Scanner(System.in);
				
			
		//ask user to input their first name, last name, high school, and the following grades:  Q1, Q2, Exam1, Q3, Q4, Exam2
		//Be sure to use complete and appropriate prompts and variable names and types
		
		
		
		System.out.print("First Name");
		String fname = tribe.next();
		
		System.out.print("Last Name");
		String lname = tribe.next();
		
		System.out.print("High school");
		String hs = tribe.next();
		
		System.out.print("Q1");
		int fq = tribe.nextInt();
		
		System.out.print("Q2");
		int sq = tribe.nextInt();
		
		System.out.print("Exam 1");
		int fx = tribe.nextInt();
		
		System.out.print("Q3");
		int tq = tribe.nextInt();
		
		System.out.print("Q4");
		int foq = tribe.nextInt();
		
		System.out.print("Exam 2");
		int sx = tribe.nextInt();
		
		
		
		//calculate the final grade (each grading period is worth 20% of final grade and the exams are worth 10% each)
		
		
		double ffq = (fq*0.20);
		double fsq = (sq*0.20);
		double ffx = (fx*0.10);
		double ftq = (tq*0.20);
		double ffoq = (foq*0.20);
		double fsx = (sx*0.10);
		double avg = (ffq+fsq+ffx+ftq+ffoq+fsx);
		
		
		
		//format your output using the following example(you must use a print format for the data line):
		//        Student Name         School            Qtr 1   Qtr 2   Ex 1   Qtr 3   Qtr 4   Ex 2    Final Grade
		//     Flintstone, Fred    Westerville South      98      85      76      93      88     92        88.5
		
		
	
		String format = "%8s%9s%12s%3d%3d%3d%3d%3d%3d%4.1f";
		System.out.printf(format,fname,lname,hs,fq,sq,fx,tq,foq,sx,avg);
	
	

	}
}


