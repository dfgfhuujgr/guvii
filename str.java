/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=0,c=0,i=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		String s1=s.nextLine();
		String s2=s.nextLine();
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			  ++c;
		}
		for(i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
	}
}
