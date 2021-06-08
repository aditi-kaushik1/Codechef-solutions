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
		int x;
		int res = 0;
		int n;
		int count = 0;
		while(t-- != 0) {
		    res = 0;
		    count = 0;
		    x = sc.nextInt();
		    n = x;
		    while(x != 0) {
		        x /= 10;
		        count++;
		    }
		    for(int i = 0; i < count; i++) {
		        res = res * 10 + (n % 10);
		        n /= 10;
		    }
		    System.out.println(res);
		}
	}
}
