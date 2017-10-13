package com.java.collections.codes;

import java.util.ArrayList;
import java.util.List;

public class Node1<T> {
    private List<Node1<T>> children = new ArrayList<Node1<T>>();
    private Node1<T> parent = null;
    private T data = null;

    public Node1(T data) {
        this.data = data;
    }

    public Node1(T data, Node1<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    public List<Node1<T>> getChildren() {
        return children;
    }

    public void setParent(Node1<T> parent) {
        parent.addChild(this);
        this.parent = parent;
    }

    public void addChild(T data) {
        Node1<T> child = new Node1<T>(data);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(Node1<T> child) {
        child.setParent(this);
        this.children.add(child);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        if(this.children.size() == 0) 
            return true;
        else 
            return false;
    }

    public void removeParent() {
        this.parent = null;
    }
}