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
		int L = sc.nextInt();
		int R = sc.nextInt();
		for(int i = L; i < R - 1; i++)
		    if(i % 2 == 1)
		        System.out.print(i + " ");
		if((R - 1) % 2 == 1)
		    System.out.print(R - 1);
		else
		    System.out.print(R);
	}
}
