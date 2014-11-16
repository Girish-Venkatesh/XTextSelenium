package com.vmware.in.testframework.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.vmware.in.vmware.constants.ApplicationInstances;

public class PropertyReader {
	
	public String getPropertyValue(String key) {
		Properties prop = new Properties();
		
		try {
			InputStream is = new FileInputStream(ApplicationInstances.getTestcaseFilePath()+ApplicationInstances.getPropertyFileName());
			prop.load(is);
			return prop.getProperty(key);
		} catch (FileNotFoundException e) {
			System.err.println(e.toString());
			
		} catch (IOException e) {
			System.err.println(e.toString());
		}
		return null;
	}

}
