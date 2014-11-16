package com.vmware.in.testframework.jsonstrucure;

import java.util.HashMap;
import java.util.Map;

public class FieldData {
	
	private Map<String, FieldAttributes> captionToTitleNameMap;
	
	public Map<String, FieldAttributes> getAttributes() {
		
		if(captionToTitleNameMap == null) {
			captionToTitleNameMap = new HashMap<String, FieldAttributes>();
		}
		
		return captionToTitleNameMap;
		
	}

}
