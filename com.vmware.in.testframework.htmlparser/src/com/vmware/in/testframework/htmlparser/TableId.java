package com.vmware.in.testframework.htmlparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TableId {
	
	private static Map<String, ArrayList<String>> tableToId;
	
	public Map<String, ArrayList<String>> getAttributes() {
		if(tableToId == null) {
			tableToId = new HashMap<String, ArrayList<String>>();
		}
		return tableToId;
	}

}
