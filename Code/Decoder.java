//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Decoder
{
	private char letter;

	public Decoder()
	{


	}
	public Decoder(char let)
	{
		letter=let;
	}

	public void setLetter(char let)
	{
		letter=let;
	}

	public char deCode()
	{
		if(letter == 0) {
			char result = 'A';
		}
		else if(letter == 1) {
			char result = 'B';
		}	
		else if(letter == 2) {
			char result = 'C';
		}			
		else if(letter == 3) {
			char result = 'D';
		}			
		else if(letter == 4) {
			char result = 'E';
		}			
		else if(letter == 5) {
			char result = 'F';
		}			
		else if(letter == 6) {
			char result = 'G';
		}			
		else if(letter == 7) {
			char result = 'H';
		}			
		else if(letter == 8) {
			char result = 'I';
		}			
		else if(letter == 9) {
			char result = 'J';
		}							
		else if(letter.charAt(0).isLowerCase() == true) {
			char result = letter.toUpperCase();
		}
		else if (letter.charAt(0).isUpperCase() == true) {
			char result = letter.toLowerCase();
		}
		return 0;
	}

	public String toString()
	{
		return " decodes to " + result;
	}
}