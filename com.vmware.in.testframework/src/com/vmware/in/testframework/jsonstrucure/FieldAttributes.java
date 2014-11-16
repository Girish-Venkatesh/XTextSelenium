package com.vmware.in.testframework.jsonstrucure;

import java.util.HashMap;
import java.util.Map;

public class FieldAttributes {
	
	private String caption;
	
	private Map<String, String> titleToNameMap;

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public Map<String, String> getAttributes() {
		if(titleToNameMap == null) {
			titleToNameMap = new HashMap<String, String>();
		}
		
		return titleToNameMap;
	}
	
	public String toString() {
		return "[caption="+getCaption()+"]";
	}
	

}
