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
		while(t-- != 0) {
		    int num = sc.nextInt();
		    int ans = 0;
		    while(num > 0) {
		        ans += Math.pow(num, 2);
		        num -=2;
		    }
		    System.out.println(ans);
		}
	}
}
