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
		int[] arr = new int[N];
		int j = 0;
		int x = N;
		while(N-- != 0)
		    arr[j++] = sc.nextInt();
		for(int i = 0; i < x/2; i++) {
		    int temp = arr[i];
		    arr[i] = arr[x - i - 1];
		    arr[x - i - 1] = temp;
		}
		for(int y : arr)
		    System.out.print(y + " ");
	}
}
