//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		rootOne = 0;
		rootTwo = 0;
	}
	public Quadratic(int quadA, int quadB, int quadC)
	{
		a=quadA;
		b=quadB;
		c=quadC;
	}
	public void setEquation(int quadA, int quadB, int quadC)
	{
		a=quadA;
		b=quadB;
		c=quadC;
 	}
	public void calcRoots( )
	{
		rootOne= ((double)-b+(Math.sqrt((b*b)-4*(a)*(c))))/(2*(a));
		rootTwo= ((double)-b-(Math.sqrt((b*b)-4*(a)*(c))))/(2*(a));
	}
    public void print()
    {
    	System.out.println("rootone ::" + rootOne + "\nrootTwo:: " + rootTwo);
    }
    
    //complete either print or the toString()

	public String toString()
	{
		return "";
	}
}