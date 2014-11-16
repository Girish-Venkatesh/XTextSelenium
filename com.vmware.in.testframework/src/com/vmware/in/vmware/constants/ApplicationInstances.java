package com.vmware.in.vmware.constants;

public class ApplicationInstances {
	
	private static String testcaseFilePath;
	private static String testcaseFileName;
	private static int testcasesCount = 0;
	private static String propertyFileName;
	private static String testURL;
	
	public static String getTestURL() {
		return testURL;
	}
	public static void setTestURL(String testURL) {
		ApplicationInstances.testURL = testURL;
	}
	public static String getPropertyFileName() {
		return propertyFileName;
	}
	public static void setPropertyFileName(String propertyFileName) {
		ApplicationInstances.propertyFileName = propertyFileName;
	}
	public static String getTestcaseFilePath() {
		return testcaseFilePath;
	}
	public static void setTestcaseFilePath(String testcaseFilePath) {
		ApplicationInstances.testcaseFilePath = testcaseFilePath;
	}
	public static String getTestcaseFileName() {
		return testcaseFileName;
	}
	public static void setTestcaseFileName(String testcaseFileName) {
		ApplicationInstances.testcaseFileName = testcaseFileName;
	}
	public static int getTestcasesCount() {
		return testcasesCount;
	}
	public static void setTestcasesCount(int testcasesCount) {
		ApplicationInstances.testcasesCount = testcasesCount;
	}
	
	

}
