//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class GradeCheck
{
	public static void main( String args[] )
	{
		Grade checker = new Grade();
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter a number grade :: ");
		int grade = keyboard.nextInt();
		
		checker.setGrade(grade);
		checker.getLetterGrade();
		checker.toString();
		out.println(checker);
	}
}