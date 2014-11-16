package com.vmware.in.testframework.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UtilFactory {
	
	public String readFile(String jSON_FILE) throws IOException {
		InputStream is = getClass().getClassLoader().getResourceAsStream(jSON_FILE);
		
		InputStreamReader isreader = new InputStreamReader(is);
		
		BufferedReader bf = new BufferedReader(isreader);
		
		StringBuilder sb = new StringBuilder();
		
		String read = bf.readLine();
		
		while(read != null) {
			sb.append(read);
			read = bf.readLine();
		}
		
		return sb.toString();
	}

}
