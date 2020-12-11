/**
 * 
 */
package com.ss.basics.assignment;
import java.io.File;
import java.util.Date;
/**
 * @author yashe
 *
 */
public class CountFileDirectories {

	public static void main(String[] args) {
		
		File file = new File("/home/yashey/");
		String[] fList = file.list();
		
		for(String name:fList) {
			System.out.println(name);
		}
	}

}
