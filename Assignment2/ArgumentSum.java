/**
 * 
 */
package com.ss.basics.assignment;

/**
 * @author yashe
 *
 */
public class ArgumentSum {
	public static void main(String[] args) {
		// initialize starting variables i and sum
		int i, sum=0;
		// for loop for iterating throug the command line args
		for(i=0; i<args.length; i++)
		{
			// converting string to integer and adding to running sum
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}
}
