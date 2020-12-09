/**
 * 
 */
package com.ss.basics.assignment;

/**
 * @author yashe
 *
 */
public class MaxNumberArray {

	public static void main(String[] args) {
		int [][] array = {
				{17, 4, 8},
				{29, 6, 1}
		};
		System.out.println("Max Number is: " + findMaxNumber(array));
		}
	
	public static int findMaxNumber(int[][] nums) {
		int maxNumber = nums[0][0];
		int position;
		for (int i=0; i < nums.length; i++) {
			for (int j=0; j < nums[i].length; j++) {
				if(nums[i][j] > maxNumber) {
					maxNumber = nums[i][j];
					System.out.println("Position is: "+ i + ", " + j);
				}
			}
		}
		return maxNumber;
	}

}
