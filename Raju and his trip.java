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
		int N = sc.nextInt();
// 		if(N % 5 == 0 || N % 6 == 0)
// 		    System.out.println("YES");
//         else
// 		    System.out.println("NO");
        String s = (N % 5 == 0 || N % 6 == 0) ? "YES" : "NO";
        System.out.println(s);
	}
}
