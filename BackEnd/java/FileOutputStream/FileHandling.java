package com.cg.FileHandling.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
    	try {
			FileOutputStream f1 = new  FileOutputStream("anu.txt");
			String s1="rani";
			byte b1[] = s1.getBytes();
			f1.write(b1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
