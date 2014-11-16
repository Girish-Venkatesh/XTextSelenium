package com.vmware.in.testframework.starter;

import com.vmware.in.testframework.parser.Parser;

public class Start {
	
	public static void main(String[] args) {
		Parser parse = new Parser();
		parse.generateJson();
	}

}
