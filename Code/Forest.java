//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Forest
{
	private Thing[][] grid;

	public Forest(int rows, int cols)
	{
		final String[] typeList = "cat dog tree rock".split(" ");
		final String[] nameList = "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");
		
		grid = new Thing[rows][cols];		
		for( int i = 0; i < rows; i++)
		{
			for( int j = 0; j < cols; j++)
			{
				int x = (int)( Math.random() * typeList.length );
				int y = (int)( Math.random() * nameList.length );
				double z = Math.random()* 25 + 10; 
				grid[i][j] = new Thing( typeList[x], nameList[y], z);
			}
		}
	}



	public int setTrappedToNull( )
	{
		int count = 0;
		for( int i = 0; i < grid.length; i++)
		{
			for( int j = 0; j < grid[i].length; j++)
			{
				if( isTrapped( i, j ))
				{
					grid[i][j] = null;
					count++;
				}
			}
		}
		return count;
	}
	
	  //if location ! a rock && 
	  //is surrounded by > 5 trees or rocks larger than 10
	public boolean isTrapped( int r, int c)
	{
		if( grid[r][c].getType().equals("rock") )
			return false;
			
		int cnt = 0;
		int[] rr = {1,0,-1};
		for( int x : rr)
		{
			for(int i : rr)
			{
			    if( inBounds(r+x, c+i) && grid[r+x][c+i]!=null )
			    	if( grid[r+x][c+i].getType().equals("rock") || grid[r+x][c+i].getType().equals("tree") )
			    		if( grid[r+x][c+i].getSize() > 10 )
			    			cnt++;
			}
		}
		return cnt > 5;
	}

	private boolean inBounds( int r, int c)
	{
		return r < grid.length && r>=0 && c <grid[0].length && c>=0;
	}


	public String toString()
	{
		String output="";
		for( Thing [] row : grid )
		{
			for( Thing val : row)
			{
				output = output +  ( val == null ? "null " : val );
			}
			output += "\n";
		}
		return output.trim();
	}
}