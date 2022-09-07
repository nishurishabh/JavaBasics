/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		getInput();
	}
	
	public static void getInput() {
		
		// input an int, double and string
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		String s = input.next();
		
		System.out.println("int: " + a);
		System.out.println("double: " + b);
		System.out.println("string: " + s);
		
		return ;
		
	}
}