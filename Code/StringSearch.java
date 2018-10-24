//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import static java.lang.System.*;

public class StringSearch
{
	/*
	 *method countWords will count the occurrences of word in sent
	 *there may many occurrences of word or none at all
	 */
	public static int countWords(String sent, String word)
	{
		int cnt = 0;
		for(int i=0; i <= sent.length()-word.length(); i++){
			if(sent.substring(i,i+word.length()).equals(word)) {
				cnt++;
			}
		}
		return cnt;
	}

	/*
	 *method countLetters will count the occurrences of letter in sent
	 *there may many occurrences of letter or none at all
	 */
	public static int countLetters(String sent, String letter)
	{
		int cnt = 0;
		for(int i=0; i <= sent.length()-1; i++){
			if(sent.substring(i,i+1).equals(letter)) {
				cnt++;
			}
		}
		return cnt;
	}
}