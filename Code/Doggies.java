//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		pups[spot] = new Dog(age,name);	
	}

	public String getNameOfOldest()
	{
		String NameofOldest = "";
		int oldest = Integer.MIN_VALUE;
		for(int i=0; i < pups.length; i++) {
			if(pups[i].getAge() > oldest) {
				oldest = pups[i].getAge();
				NameofOldest = pups[i].getName();
				
			}
		}
		return NameofOldest;
	}

	public String getNameOfYoungest()
	{
		String NameofYoungest = "";
		int youngest = Integer.MAX_VALUE;
		for(int i=0; i < pups.length; i++) {
			if(pups[i].getAge() < youngest) {
				youngest = pups[i].getAge();
				NameofYoungest = pups[i].getName();
				
			}
		}
		return NameofYoungest;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}