package com.vmware.in.testframework.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.Gson;

public class UtilFunctions {

	private static String JsonHandler;

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

	public static String getCaptionFromJsonData(String recordtype, String fieldName) {
		String json = null;
		try {
			if(JsonHandler == null) {
				File file = new File(Constants.JSON_FILE);
				FileReader fr;

				fr = new FileReader(file);

				BufferedReader bufferReader = new BufferedReader(fr);
				StringBuffer sb = new StringBuffer();
				String br = bufferReader.readLine();
				while(br != null) {
					sb.append(bufferReader);
					br = bufferReader.readLine();
				}
				json = sb.toString();

				Gson gson = new Gson();

			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;



	}

	public static String getDataFromFile(File file) {
		StringBuffer sb = new StringBuffer();
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			
			String data;

			data = br.readLine();

			while(data != null) {
				sb.append(data);
				data = br.readLine();
			}
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}





}
