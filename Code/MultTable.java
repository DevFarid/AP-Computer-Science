//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
		number=num;
		stop=end;
	}
	public void setTable(int num, int end)
	{
		number=num;
		stop=end;
	}
	public void printTable( )
	{
		for (int i=1; i <= number; i++){
			out.println(i + " " + i*stop);
		}
	}
}