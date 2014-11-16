package com.vmware.in.testframework.wrapper;

import com.vmware.in.testframework.testFramework.Greeting;
import com.vmware.in.vmware.constants.ApplicationInstances;

public class ModelReader {
	
	public void testcaseContents(Greeting attribute) {
		
		System.out.println("----------------Start----------------------------");
		System.out.println("Property file name : "+ApplicationInstances.getPropertyFileName());
		System.out.println("Testcases path : "+ApplicationInstances.getTestcaseFilePath());
		System.out.println("Testcase no : "+ApplicationInstances.getTestcasesCount());
		System.out.println("Testcase name : "+ApplicationInstances.getTestcaseFileName());
		System.out.println("Testcases data : ");
		System.out.println("------------------------------------------------");
		System.out.println(attribute.getTestcaseValue());
		System.out.println(attribute.getSummaryDetails());
		System.out.println("----------------End----------------------------");
		System.out.println();
	}

}
