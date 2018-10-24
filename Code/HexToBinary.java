//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class HexToBinary
{
	private char hex;

	public HexToBinary()
	{


	}
	public HexToBinary(char hexNum)
	{
		hex=hexNum;
	}
	public void setHex(char hexNum)
	{
		hex=hexNum;
	}
	public String getBinary()
	{
		if(hex == "A"){
			return "A is 1010 in binary!";
		}
		else if(hex == "B"){
			return "A is 1011 in binary!";
		}
		else if(hex == "C"){
			return "A is 1100 in binary!";
		}
		else if(hex == "D"){
			return "A is 1101 in binary!";
		}
		else if(hex == "E"){
			return "A is 1111 in binary!";
		}
		else if(hex == "F"){
			return "A is 1010 in binary!";
		}
		else if(hex == "X"){
			return "X is ERROR in binary!";
		}								
		return "";
	}

	public String toString()
	{
		return "";
	}
}