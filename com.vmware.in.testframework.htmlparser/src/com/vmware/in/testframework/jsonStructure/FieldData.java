package com.vmware.in.testframework.jsonStructure;

import java.util.HashMap;
import java.util.Map;

public class FieldData {
	
	private Map<String, FieldAttributes> fieldToAttrMap;
	
	public Map<String, FieldAttributes> getAttributes() {
		if(fieldToAttrMap == null) {
			fieldToAttrMap = new HashMap<String, FieldAttributes>();
		}
		return fieldToAttrMap;
	}

}
