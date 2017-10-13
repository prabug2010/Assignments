package com.java.collections.codes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import org.apache.commons.io.FileUtils;

public class LinkedListCode {

	public static void addingDataToList() {

		LinkedList<String> l1 = new LinkedList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		File f = new File("D:/File_list_Output.txt");
		try {
			fr = new FileReader("D:/File_List_Input.txt");
			br = new BufferedReader(fr);
			String data = "";
			while ((data = br.readLine()) != null)
				if (data.isEmpty()) {
					l1.add("Prabu");
				} else {
					l1.add(data);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("list before deleting sanjay k jha : " + l1);
		l1.remove("sanjay k jha");
		System.out.println("list after deleting sanjay k jha : " + l1);
		int n = l1.size();
		System.out.println(n);
		try {
			FileUtils.writeLines(f, l1);
		} catch (IOException z) {
			z.printStackTrace();
		}

	}

	public static void main(String[] args) {

		addingDataToList();
	}

}
