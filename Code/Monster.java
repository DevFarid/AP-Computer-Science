//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster 
{
	public int height;
	public int weight;
	public int age;
    public Monster(int h, int w, int a) 
    {
    	height=h;
    	weight=w;
    	age=a;
    }
    public int getHeight()
    {
    	return height;
    }
    public int getWeight()
    {
    	return weight;
    }
    public int getAge()
    {
    	return age;
    }
    public boolean isBigger(Monster other)
    {
    	if(getHeight()>other.getHeight())
    		return true;
    	if(getHeight()<other.getHeight())
    		return false;
    	if(getWeight()>other.getWeight())
    		return true;
    	if(getWeight()<other.getWeight())
    		return false;
    		if(getAge()>other.getAge())
    			return true;
    			return false;
    }
    public String toString()
    {
    	return height + " " + weight + " " + age;
    }
}