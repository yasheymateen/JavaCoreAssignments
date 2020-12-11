package com.ss.basics.assignment;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class countOccurences {

	public static void main(String[] args) {
		int i, occurences = 0;
		
		try {
			FileInputStream file = new FileInputStream("/home/yashe");
			BufferedInputStream bStream = new BufferedInputStream(file);
		while((i = bStream.read())!=-1) {
			char c = (char)i;
			
			if(arg=args[0].charAt(0)) {
				occurences++;
			}
		}
		System.out.println("letter e occurences: " + occurences);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());		
		}
	}

}
