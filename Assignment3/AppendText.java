package com.ss.basics.assignment;

import java.io.FileWriter;
import java.io.IOException;
public class AppendText {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		String text = "Appended Text";
				
		try {
			FileWriter fWrite = new FileWriter(path, true));
			fw.write(text);
			fw.close(0);
		} catch(IOException e) {
			
			
		}

}
