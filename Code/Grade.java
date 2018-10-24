//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Grade
{
	private int numGrade;

	public Grade()
	{
	}
	public Grade(int grade)
	{
		numGrade=grade;
	}
	public void setGrade(int grade)
	{
		numGrade=grade;
	}
	public String getLetterGrade( )
	{
		if(numGrade >= 90){
			String letGrade="A";	
			return letGrade;
		}
		else if(numGrade >= 80){
			String letGrade="B";	
			return letGrade;			
		}
		else if(numGrade >= 75){
			String letGrade="C";	
			return letGrade;			
		}
		else if(numGrade >= 70){
			String letGrade="D";	
			return letGrade;			
		}
		else if(numGrade < 70){
			String letGrade="F";	
			return letGrade;			
		}		
			return "Grade not found.";
	} 
	public String toString()
	{
		return numGrade + " is a " + getLetterGrade() + "\n";
	}
}