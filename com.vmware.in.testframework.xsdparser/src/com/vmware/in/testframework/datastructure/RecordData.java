package com.vmware.in.testframework.datastructure;

import java.util.HashMap;
import java.util.Map;

public class RecordData {
	
	private static RecordData rdObject;
	private Map<String, FieldData> recordToFieldMap;
	
	public static RecordData getInstance() {
		if(rdObject == null) {
			rdObject = new RecordData();
		}
		return rdObject;
	}
	
	
	public Map<String, FieldData> getAttributes() {
		if(recordToFieldMap == null) {
			recordToFieldMap = new HashMap<String, FieldData>();
		}
		return recordToFieldMap;
	}

}
