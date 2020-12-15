package com.ss.assessment.lambdas;

import java.util.List;

import com.ss.assessment.lambdas.*;
public class LambdasMain {
	
	static Lambdas lambda = new Lambdas("A", "short", "string", "list");
	
	
	public static void main(String[] args) {
		getList(lambda);
	}
	
	public static List getList(Lambdas lambda2) {
		List<String> arr = lambda2.getStrings();
		System.out.println(lambda2.sort());
	}
}
