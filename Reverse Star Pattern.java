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
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
		    for(int j = 1; j <= n - i; j++)
		        System.out.print(" ");
		    for(int k = 1; k <= i; k++)
		        System.out.print("*");
		    System.out.println();
		}
	}
}
