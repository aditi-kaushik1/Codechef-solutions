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
		    System.out.println(squareRoot(number));
		}
	}
	
	public static int squareRoot(int number) {
	    int left = 1;
	    int right = number;
	    int mid = 1;
	    while(left <= right) {
	        mid = left + (right - left)/2;
	        if(number / mid == mid) return mid;
	        else if(number / mid > mid) left++;
	        else    right--;
	    }
	    return mid;
	}
}
