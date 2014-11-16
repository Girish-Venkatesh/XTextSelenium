package com.vmware.in.testframework.htmlparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ButtonAttributes {
	
	private static Map<String, ArrayList<String>> buttonnameToId;
	
	public Map<String, ArrayList<String>> getAttributes() {
		if(buttonnameToId == null) {
			buttonnameToId = new HashMap<String, ArrayList<String>>();
		}
		return buttonnameToId;
	}

}
