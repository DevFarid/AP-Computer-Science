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
		
		out.println("Enter 1st Monster Name :: ");
		String name = keyboard.next();
		
		out.println("Enter 1st Monster Size :: ");
		int size = keyboard.nextInt();
		
		
		Monster one = new Skeleton(name,size);
		
		
		out.println("Enter 2nd Monster Name :: ");
		String name2 = keyboard.next();
		
		out.println("Enter 2nd Monster Size :: ");
		int size2 = keyboard.nextInt();
		
		Monster two = new Skeleton(name2, size2);
		
		out.println("\n\nMonster one - " + one + "\nMonster two - " + two + "\n");
		
		if(one.isBigger(two)) {
			out.println("Monster one is bigger than Monster two.");
		}
		else if(one.isSmaller(two)) {
			out.println("Monster one is smaller than Monster two.");
		}
		else {
			out.println("Monster one is the same as Monster two.");
		}
		
		
		if(one.namesTheSame(two)) {
			out.println("Monster one has the same name as Monster two.");
		}
		else {
			out.println("Monster one does NOT have the same name as Monster two.");
		}
	}
}