//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;
	private String input;

	public PasswordCheck()
	{
		password="mchammergohammer";
		do{
			if(input == password) {
				out.println("VALID.");
			}
			else {
				out.println("INVALID.");
			}
		}while(input!=password);
		
	}
	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter the password :: ");
		input = keyboard.next();
	}
}