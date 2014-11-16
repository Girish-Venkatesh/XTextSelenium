package com.vmware.in.testframework.jsonstrucure;

import java.util.HashMap;
import java.util.Map;

public class RecordData {
	
	private RecordData recorddata;
	private Map<String, FieldData> fieldToAttrMap;
	
	public RecordData getInstance() {
		if(recorddata == null) {
			recorddata = new RecordData();
		}
		return recorddata;
	}
	
	public Map<String, FieldData> getAttributes() {
		if(fieldToAttrMap == null) {
			fieldToAttrMap = new HashMap<String, FieldData>();
			
		}
		
		return fieldToAttrMap;
	}

}
