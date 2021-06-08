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
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A > B) {
		    if(C > A)
		        System.out.println(A);
		    else if(B > C)
		        System.out.println(B);
		    else
		        System.out.println(C);
		}
		else {
		    if(C > B)
		        System.out.println(B);
		    else if(A > C)
		        System.out.println(A);
		    else
		        System.out.println(C);
		}
	}
}
