package com.vmware.in.testframework.datastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldAttributes {
	
	private String caption;
	private String type;
	private String tab;
	
	private Map<String, List<String>> fieldAttrList;

	public FieldAttributes(String caption, String tab, String type) {
		this.caption = caption;
		this.tab = tab;
		this.type = type;
	}
	
	
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}
	
	public Map<String, List<String>> getAttributes() {
		if(fieldAttrList == null) {
			fieldAttrList = new HashMap<String, List<String>>();
		}
		return fieldAttrList;
	}
	
	@Override
	public String toString() {
		return "[caption = "+getCaption()+"[type ="+getType()+"[tab ="+getTab()+"]";
	}
	
	
	
	

}
