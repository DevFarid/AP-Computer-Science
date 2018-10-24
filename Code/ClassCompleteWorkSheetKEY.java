//(c) A+ Computer Science
//www.apluscompsci.com

//class complete worksheet key

import static java.lang.System.*;  
import java.util.List;
import java.util.ArrayList;
import java.io.File;

class Pet
{
	private String name;
	private int age;
	
	public Pet(String n, int a)
	{
		name=n;
		age=a;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public boolean isOld()
	{
		return age > 15;
	}
	public String toString()
	{
		return name + " " + age;
	}
}

class Zoo
{
   private List<Pet> animals;
	
   public Zoo()
   {
		animals = new ArrayList<Pet>();
   }
	
   public void add( String n, int a )
   {
		animals.add(new Pet(n,a));
   }
	
   //make new method called countOldOnes() that will return the count of all old animals
	public int countOldOnes()
	{
		int count = 0;
		for(Pet p: animals) {
			if(p.isOld()) {
				count++;
			}
		}
		return count;
	}

  public String toString()
   {
		return " " + animals;
   }
}

public class ClassCompleteWorkSheetKEY
{
   public static void main(String args[]) throws Exception
   {
			Zoo it = new Zoo();
			it.add("bob", 9);
			it.add("ann", 78);
			it.add("sue", 18);
			System.out.println(it);
			System.out.println(it.countOldOnes());			
   }
}