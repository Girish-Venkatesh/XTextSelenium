package com.vmware.in.testframework.htmlparser;

public class Test {
	
	public static void main(String[] args) {
		String UI_ELEMENTS = "Reports|vCAC Administrator";
		String test = "reports";
		
		if(test.matches(UI_ELEMENTS.toLowerCase())) {
			System.out.println("hello");
		}
	}

}
