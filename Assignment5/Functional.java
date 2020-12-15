package com.ss.day5.assignment;

import java.util.List;
import java.util.stream.Collectors;

public class Functional {

	static List<Integer> rightDigit(List<Integer> digits) {
		return digits.stream().map(n -> n % 10).collect(Collectors.toList());
	}
	
	static List<Integer> doubling(List<Integer> digits) {
		return digits.stream().map(n -> n * 2).collect(Collectors.toList());
	}
	
	static List<String> noX(List<String> strings) {
		return strings.stream().map(str -> str.replaceAll("x", "")).collect(Collectors.toList());
	}
	
	/*
	 * following method identifies whether it is possible to choose a group of some of ints,
	 * given an array of ints, such that the group sums to the given target
	 */
	static boolean groupSumClump(Integer ind, int[] nums, int target) {
		if (ind >= nums.length) {
			return target == 0;
		}
		
		Integer starting = ind;
		Integer next = ind + 1;
		while(next < nums.length && nums[next] == nums[ind]) {
			ind++;
			next++;
		}
		
		boolean skipCluster = groupSumClump(next, nums, target);
		
		Integer sumOfCluster = nums[ind] * (next - starting);
		boolean includeCluster = groupSumClump(next, nums, target - sumOfCluster);
		
		return skipCluster || includeCluster;
	}
	
}
