//(c) A+ Computer Science
//Www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour  // constructor
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour() 
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{	
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = distance / ((double)hours+((double)minutes/60));
	}

	public void print()
	{
		System.out.println(distance + " mile(s) in " + hours + " hour(s) and " + minutes + " minute(s) = " + mph + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}