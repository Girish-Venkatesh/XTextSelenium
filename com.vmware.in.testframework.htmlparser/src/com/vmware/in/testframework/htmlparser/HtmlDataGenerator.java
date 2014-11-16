package com.vmware.in.testframework.htmlparser;

import java.io.IOException;

import com.vmware.in.testframework.util.Constants;
import com.vmware.in.testframework.util.SchemaJsonReader;
import com.vmware.in.testframework.util.UtilFunctions;

public class HtmlDataGenerator {
	
	public static void main(String[] args) {
		
		
		try {
			UtilFunctions uf = new UtilFunctions();
			String htmlSource = uf.readFile(Constants.HTML_FILE);
			HtmlPage htmlPage = new HtmlPage();
			htmlPage.parseHTML(htmlSource);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Button Attributes");
		ButtonAttributes ba = new ButtonAttributes();
		System.out.println(ba.getAttributes());
		
		System.out.println("table Attributes");
		TableId ta = new TableId();
		System.out.println(ta.getAttributes());
		
//		System.out.println("Tree TD Attributes");
//		TreeTdElements treeData = new TreeTdElements();
//		System.out.println(treeData.getAttributes());
		
//		SchemaJsonReader sc = SchemaJsonReader.getInstance();
//		String caption = sc.getCaption("Issue", "IssueType");
//		System.out.println(caption);
		
	}

}
