package com.java.collections.codes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class JavaTreeCode {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		File f1 = new File("D:\\File_Tree_Input.txt");
		List<String> l1 = new ArrayList<String> ();
		Map<String, List<String>> h1 = new TreeMap<String, List<String>> (new HierarchyComparator());
		try {
			fr = new FileReader(f1);
			br = new BufferedReader(fr);
			String s = "";

			while ((s = br.readLine()) != null) {
				String[] x = s.split(", ");
				String role = x[1];
				String name = x[0];
				if(h1.get(role)!=null){
					h1.get(role).add(name);
				} else {
					l1 = new ArrayList<String>();
					l1.add(name);
				}
				h1.put(role, l1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Node treeRootNode = null;
		Node node  = null;
		int count = 0 ;
		for (Map.Entry<String, List<String>> o : h1.entrySet()) {
			node = addChild(node, o.getKey() + " -  " + o.getValue());
			if (count == 0) {
				treeRootNode = node;
			}
			count++;
		}
		printTree(treeRootNode, 0);
	}

	private static Node addChild(Node parent, String id) {
		Node node = new Node(parent);
		node.setId(id);
		if(parent!=null)
			parent.getChildren().add(node);
		return node;
	}

	private static void printTree(Node node, int count) {
		for(int i=0;i<count;i++){
			System.out.print(" ");
		}
		System.out.print(node.getId() + "\n");
		for (Node each : node.getChildren()) {
			printTree(each, ++count);
		}
	}
}