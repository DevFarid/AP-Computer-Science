 /**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "THE BASEBALL BAT HIT THE BASEBALL.";
		
		//  Demonstrate the indexOf method.
	//	int position = sample.indexOf("THE");
		int pos = sample.indexOf("THE");
		if(pos != -1)
			System.out.println("THE is found at position " + pos);
		else
		System.out.println("THE is not found");
	//	System.out.println ("sample.indexOf(\"THE\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		indexOf("Computer Science is the best, the greatest, and the most wonderful subject to study!", 0);
		//  Try other methods here:
	}
		public static void indexOf(String str, int fromIndex) {
			int i = str.indexOf("the");
			while(i >= 0) {
			     System.out.println(i);
			     i = str.indexOf("the", i+1);
			}
		}

}
