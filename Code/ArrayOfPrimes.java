//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class ArrayOfPrimes
{
	//instance variables and constructors could be present, but are not necessary
	
	//rayOPrimes will return an array containing the first 
	//numPrimes primes starting at 2
	public static int[] getPrimeList(int numPrimes)
	{
		return getPrimeList(numPrimes, 2);
	}

	//getPrimeList(int numPrimes, int primeStart) will return an array 
	//containing the first numPrimes primes starting at primeStart
	public static int[] getPrimeList(int numPrimes, int primeStart)
	{
		int[] primes = new int[numPrimes];		
		for(int i=primeStart,j=0; j < numPrimes; i++) {
			if(isPrime(i)== true) {
				primes[j++]=i;
			}
		}
		return primes;
	}
		
	//isPrime will return true if num is prime
	//a prime number is any number ony divisible by 1 and itself
	private static boolean isPrime(int num)
	{
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}