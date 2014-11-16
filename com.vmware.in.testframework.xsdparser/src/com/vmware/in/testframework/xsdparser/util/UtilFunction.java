package com.vmware.in.testframework.xsdparser.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UtilFunction {

	public static void writeToFile(String json, String file) {
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(json);
			bw.flush();
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
