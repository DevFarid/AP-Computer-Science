//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int size; String name;	
		out.println("Enter 1st Monster Name :: ");
		name = keyboard.next();
		out.println("Enter 1st Monster Size :: ");
		size = keyboard.nextInt();
		Monster one = new Monster(name,size);
		
		
		out.println("Enter 2nd Monster Name :: ");
		name = keyboard.next();
		out.println("Enter 2nd Monster Size :: ");
		size = keyboard.nextInt();
		Monster two = new Monster(name,size);
	
		out.println("Monster 1 - " + one);
		out.println("Monster 2 - " + two);
		if(one.isBigger(two)) {
			out.println("Monster one is bigger than Monster two");
		}
		else if(one.isSmaller(two)) {
			out.println("Monster one is smaller than Monster two");
		}
		else {
			out.println("Monster one and two are equal.");
		}
		if(one.namesTheSame(two)) {
			out.println("Monster one has the same name as Monster two.");
		}
		else {
		out.println("Monster one does not have the same name as Monster two.");
		}
			
	}
}