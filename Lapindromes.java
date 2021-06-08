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
		String s;
		int start;
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		while(t-- != 0) {
		    s = sc.next();
		    
		    for(int i = 0; i < s.length()/2; i++)
		        map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0) + 1);
		        
		    if(s.length() % 2 == 0)
		        start = s.length()/2;
		        
		    else
		        start = s.length()/2 + 1;
		    
		    for(int i = start; i < s.length(); i++)
		        map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i),0) + 1);
		        
		    if(map1.equals(map2))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		        
		    map1.clear();
		    map2.clear();
		}
	}
}
