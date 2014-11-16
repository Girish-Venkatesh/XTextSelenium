package com.vmware.in.testframework.htmlparser;

import java.util.HashMap;
import java.util.Map;

public class TreeTdElements {
	
	private static Map<String, String> treeTDnameToId;
	
	public Map<String, String> getAttributes() {
		if(treeTDnameToId == null) {
			treeTDnameToId = new HashMap<String, String>();
		}
		return treeTDnameToId;
	}

}
