package com.java.collections.codes;

public class TreeTest {
	 
	 public static void main(String[] args) {
	  Node treeRootNode = new Node(null);
	  treeRootNode.setId("root");
	  // add child to root node 
	  Node childNode= addChild(treeRootNode, "child-1");
	  // add child to the child node created above
	  addChild(childNode, "child-11");
	  addChild(childNode, "child-12");
	   
	  // add child to root node
	  Node child2 = addChild(treeRootNode, "child-2");
	  // add child to the child node created above
	  addChild(child2, "child-21");
	 
	  printTree(treeRootNode, " ");
	 
	 }
	 
	 private static Node addChild(Node parent, String id) {
	   Node node = new Node(parent);
	   node.setId(id);
	   parent.getChildren().add(node);
	   return node;
	 }
	 
	 private static void printTree(Node node, String appender) {
	  System.out.println(appender + node.getId());
	  for (Node each : node.getChildren()) {
	   printTree(each, appender + appender);
	  }
	 }
	}