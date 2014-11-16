package com.vmware.in.testframework.parser;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

import com.google.gson.Gson;
import com.vmware.in.testframework.datastructure.FieldAttributes;
import com.vmware.in.testframework.datastructure.FieldData;
import com.vmware.in.testframework.datastructure.RecordData;
import com.vmware.in.testframework.xsdparser.util.Constants;
import com.vmware.in.testframework.xsdparser.util.UtilFunction;

public class Parser {
	
	private RecordData rd = RecordData.getInstance();
	private FieldData fd = new FieldData();

	public void generateJson() {
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {
				String recordTag = "xs:elements";
				String tabTag = "xs:complexType";
				String fieldTag = "xs:element";
				boolean recordFlag = false;
				boolean tabFlag = false;
				boolean fieldFlag = false;
				String recordtype;
				String tabName;
				String fieldName;
				String captionName;
				String typeValue;

				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					if (qName.equalsIgnoreCase(recordTag)) {
						recordFlag = true;
						recordtype = attributes.getValue("name");
						fd = new FieldData();
					}
					
					if (qName.equalsIgnoreCase(tabTag)) {
						tabFlag = true;
						tabName = attributes.getValue("name");
					}
					
					if (qName.equalsIgnoreCase(fieldTag)) {
						fieldFlag = true;
						captionName = attributes.getValue("caption");
						typeValue = attributes.getValue("type");
					}
					
					
				}

				public void characters(char ch[], int start, int length)
						throws SAXException {
					if (fieldFlag) {
						fieldName = new String(ch, start, length);
						fieldFlag = false;
						if(!(fieldName.isEmpty() && recordtype.isEmpty() && tabName.isEmpty() && captionName.isEmpty() && typeValue.isEmpty())) {
							generateObject(recordtype, fieldName, captionName, tabName, typeValue);
						}
					}
				}

				
			};

			saxParser.parse(Constants.XSD_FILE, handler);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		generateJsonFile();

	}
	
	

	private void generateObject(String recordtype,
			String fieldName, String captionName, String tabName, String typeValue) {
		
		
		
		FieldAttributes attr = new FieldAttributes(captionName, tabName, typeValue);
		fd.getAttributes().put(fieldName, attr);
		rd.getAttributes().put(recordtype, fd);
		
	}
	
	private void generateJsonFile() {
		
		Gson gson = new Gson();
		Collection<RecordData> recordCollection = new ArrayList<RecordData>();
		recordCollection.add(rd);
		String json = gson.toJson(recordCollection);
		UtilFunction.writeToFile(json, Constants.JSON_FILE);
		
	}

}
