package com.vmware.in.testframework.htmlparser;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.vmware.in.testframework.util.UtilFunctions;

public class HtmlPage {

	private ButtonAttributes attr = new ButtonAttributes();
	private TableId tableattr = new TableId();
	private String currentText = "";
	private ArrayList<String> ids = new ArrayList<String>();
	private ArrayList<String> tableids = new ArrayList<String>();
	private ArrayList<String> rowids = new ArrayList<String>();

	private UiLabels labels = new UiLabels();

	public void parseHTML(String htmlSource) {

		Document document = Jsoup.parse(htmlSource);

		Elements elements = document.getAllElements();

		Iterator<Element> iter = elements.iterator();

		while(iter.hasNext()) {
			Element element = iter.next();

			if(element.tagName().equalsIgnoreCase("table")) {

				parseByTag(element);

			}

			else if(element.tagName().equalsIgnoreCase("tbody")) {

				parseByTag(element);

			}

			else if(element.tagName().equalsIgnoreCase("tr")) {

				parseByTag(element);

			}

			else if(element.tagName().equalsIgnoreCase("td")) {

				parseByTag(element);

			}

			else if(element.tagName().equalsIgnoreCase("span")) {

				parseByTag(element);

			}

			else if(element.tagName().equalsIgnoreCase("img")) {

				parseByTag(element);

			}

			else if(element.tagName().equalsIgnoreCase("a")) {

				parseByTag(element);

			}

			else if(element.tagName().equalsIgnoreCase("b")) {

				parseByTag(element);

			}


		}

		if(!tableids.isEmpty()) {
			tableids = removeDuplicates(tableids);
			tableattr.getAttributes().put("tableid", tableids);
		}

		if(!rowids.isEmpty()) {
			rowids = removeDuplicates(rowids);

			tableattr.getAttributes().put("rowid", rowids);
		}







	}




	private void parseByTag(Element element) {
		String text = element.text().trim().toLowerCase();
		String id = element.id().trim();



		if(!currentText.isEmpty() && !text.isEmpty()) {
			if(!text.equals(currentText)) {
				//				System.out.println(currentText+":"+ids);
				ids = new ArrayList<String>();
			}

		}

		if(text != null && !text.isEmpty()) {

			if(text.matches(UiLabels.UI_ELEMENTS.toLowerCase())) {
				//				System.out.println(text);
				currentText = text;
			}

			else if(currentText != null && !currentText.isEmpty()) {
				if(!text.equalsIgnoreCase(currentText)) {
					if(attr.getAttributes() != null && attr.getAttributes().get(currentText) != null) {
						ids = new ArrayList<String>();
					}
				}
			}
		}

		if(id != null && !id.isEmpty()) {
			if(ids.isEmpty()) {
				ids.add(id);
			}

			else if(ids.size() == -1) {
				ids.add(0, id);
			}
			else {
				ids.add(ids.size(), id);
			}


		}

		//		System.out.println(currentText+":"+id);
		if(!currentText.isEmpty() && !ids.isEmpty()) {
			ids = removeDuplicates(ids);


			if(attr.getAttributes().get(currentText) == null || text.equals(currentText)) {
				attr.getAttributes().put(currentText, ids);
			}	
		}

		if(id.contains("SelectedListBox_LBT")) {
			if(tableids.isEmpty()) {
				tableids.add(id);
			}

			else if(tableids.size() == -1) {
				tableids.add(0, id);
			}
			else {
				tableids.add(tableids.size(), id);
			}


		}

		else if(id.contains("DataRow")) {
			if(rowids.isEmpty()) {
				rowids.add(id);
			}

			else if(rowids.size() == -1) {
				rowids.add(0, id);
			}
			else {
				rowids.add(rowids.size(), id);
			}


		}

	}

	public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		HashSet<String> set = new HashSet<String>(list);
		list.clear();
		list.addAll(set);
		return list;
	}



}
