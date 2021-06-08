import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
		    if(i % 2 == 0) {
		        int start = i*5;
		        for(int j = 1; j <= 5; j++)
		            System.out.print(start-- + " ");
		    }
		    else {
		        int start = (i/2)*10 + 1;
		        for(int k = 1; k <= 5; k++)
		            System.out.print(start++ + " ");
		    }
		    System.out.println();
		}
	}
}
