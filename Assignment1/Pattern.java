/**
 * 
 */
package com.ss.basics.assignment;

/**
 * @author yashe
 *
 */
public class Pattern {
	public static void main(String[] args) {
		System.out.println("1)");
		leftPattern();
		System.out.println("2)");
		pyramidPattern();
		System.out.println("3)");
		leftDescending();
	}
		
	public static void leftPattern() {
	// initialize i and j for lines and columns
		int i, j, lines=4;
		
	// outer loop for number of lines
		for(i=0; i<lines; i++) {
		// inner loop for # of stars in each line
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
	public static void pyramidPattern() {
		int i, j, lines = 4;
		for (i = 0; i<lines; i++) {
			for(j=lines-i; j>1; j--) {
				System.out.print(" ");
			}
			for(j=0; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
		
	public static void leftDescending() {
		int i, j, lines = 4;
		for(i=lines-1; i>=0; i--) {
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
