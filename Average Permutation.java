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
		    if(num == 3) {
		        System.out.println("3 2 1");
		        continue;
		    }
		    System.out.print(num + " " + (num - 2) + " ");
		    for(int i = 1; i <= num - 4; i++)
		        System.out.print(i + " ");
		    if((num - 2) >= 1)
		        System.out.print((num - 3) + " ");
		    if((num - 3) >= 1)
		        System.out.print((num - 1));
		    System.out.println();
		}
	}
}
