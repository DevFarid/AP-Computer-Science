//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int total = 0;
    	for (int i = 0; i < m.length; i++) {
    		for (int k = 0; k < size; k++) {
    			m[i][k] = str.substring(total,total+1);
    			total++;
    		}
    	}
    	System.out.println(Arrays.deepToString(m));
    }

    public boolean isFound( String word )
    {
    	if (checkRight(word,m.length,m[0].length) == true) {
    		return true;
    	}
    	else if (checkLeft(word,m.length,m[0].length) == true) {
    		return true;
    	}
    	else if (checkDown(word,m.length,m[0].length) == true) {
    		return true;
    	}
    	else if (checkUp(word,m.length,m[0].length) == true) {
    		return true;
    	}
    	else if (checkDiagUpRight(word,m.length,m[0].length) == true) {
    		return true;
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		for (int col = 0; col < c; col++) {
			String str = String.join("", m[col]);
			for (int len = 0; len < c - w.length(); len++) {
				if (str.substring(len,len+w.length()).equals(w)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for (int col = 0; col < c; col++) {
			String s = String.join("", m[col]);
			String r = "";
			for(int k = str.length() - 1; k >= 0; k--)
            {
           		r = r + s.charAt(d);
            }
			for (int j = 0; j < c-w.length(); j++) {
				if (r.substring(j,j+w.length()).equals(w)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
	  String s = "";
	  String r = "";
	  
	  
	  
   	  int total = 0;
	  for (int col = 0; col < c; col++) {
	  	for (int i = 0; i < c; i++) {
	  	      s += m[j][total];
	    }
	    for(int k = str.length() - 1; k >= 0; k--) {
            r = r + str.charAt(d);
	    }
	  	for (int j = 0; j < c-w.length(); j++) {
				if (r.substring(j,j+w.length()).equals(w)) {
					return true;
				}
			}
		total++;
		
		s = "";
		r = "";
	  }
	  return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
   	  String s = "";
   	  int total = 0;
   	  
   	  
	  for (int col = 0; col < c; col++) {
	  	for (int i = 0; i < c; i++) {
	  	      s += m[j][total];
	    }
	  	for (int j = 0; j < c-w.length(); j++) {
				if (s.substring(j, j+w.length()).equals(w)) {
					return true;
				}
			}
		total++;
		s = "";
	  }
	  return false;
   }

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	  
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
