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
		int t = sc.nextInt();
		int n;
		while(t-- != 0) {
		    n = sc.nextInt();
		    int min = Integer.MAX_VALUE;
		    int count = 0;
		    while(n-- != 0) {
		        int x = sc.nextInt();
		        min = Math.min(min, x);
		        if(x == min)
		            count++;
		    }
		    System.out.println(count);
		}
	}
}
