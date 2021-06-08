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
		ArrayList<Integer> arr =new ArrayList<>();
		int count = 0;
		for(int i = 1; i <= N; i++)
		    if(N % i == 0) {
		        arr.add(i);
		        count++;
		    }
		
		System.out.println(count);
		for(int x : arr)
		    System.out.print(x + "\t");
	}
}
