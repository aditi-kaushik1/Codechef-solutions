/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases-- != 0) {
		    int number = sc.nextInt();
		    System.out.println(leastSignificantDigit(number) + mostSignificantDigit(number));
		}
	}
	
	public static int leastSignificantDigit(int number) {
	    return number % 10;
	}
	
	public static int mostSignificantDigit(int number) {
	    int numOfDigits = (int)Math.floor(Math.log10(number) + 1);
	    return number / (int)(Math.pow(10, numOfDigits - 1));
	}
}
