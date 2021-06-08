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
		int K = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		while(N-- != 0)
		    set.add(sc.nextInt());
		int x = (set.contains(K)) ? 1 : -1;
		System.out.println(x);
	}
}
