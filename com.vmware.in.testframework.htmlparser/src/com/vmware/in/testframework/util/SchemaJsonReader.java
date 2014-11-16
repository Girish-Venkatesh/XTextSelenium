package com.vmware.in.testframework.util;

import java.io.File;
import java.lang.reflect.Type;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.vmware.in.testframework.jsonStructure.FieldAttributes;
import com.vmware.in.testframework.jsonStructure.FieldData;
import com.vmware.in.testframework.jsonStructure.RecordData;

public class SchemaJsonReader {

	private static SchemaJsonReader jsonHandler;
	private static List<RecordData> jsonList;


	public static SchemaJsonReader getInstance() {
		if(jsonHandler == null) {

			File file = new File(Constants.JSON_FILE);
			String json = UtilFunctions.getDataFromFile(file);
			Gson gson = new Gson();
			Type type = new TypeToken<List<RecordData>>(){}.getType();
			List<RecordData> jsonStructureList = gson.fromJson(json, type);

			setJsonList(jsonStructureList);
			
			jsonHandler = new SchemaJsonReader();

		}

		return jsonHandler;
	}


	public static List<RecordData> getJsonList() {
		return jsonList;
	}


	public static void setJsonList(List<RecordData> jsonList) {
		SchemaJsonReader.jsonList = jsonList;
	}

	public String getCaption(String recordtype, String fieldname) {

		List<RecordData> json = jsonList;
		for (RecordData recordData : json) {

			if(recordData.getAttributes().containsKey(recordtype)) {
				FieldData field = recordData.getAttributes().get(recordtype);
				if(field.getAttributes().containsKey(fieldname)) {
					FieldAttributes attr = field.getAttributes().get(fieldname);
					return attr.getCaption();
				}


			}
		}
		return null;

	}
}