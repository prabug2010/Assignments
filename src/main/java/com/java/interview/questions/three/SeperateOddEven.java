package com.java.interview.questions.three;

public class SeperateOddEven {

    static Node head;
    static int count;

    public static class Node {
        int data;
        Node next;

        private Node(int data) {
            this.data = data;
            next = null;
            count++;
        }

    }


    public void seperate() {

        Node even = null;
        Node odd = null;
        Node temp;

        // go through each linked-list and place node in new list depending on whether they are even or odd
        while(head != null) {
            // if even, place in even linked-list
            if(head.data % 2 == 0) {
                temp = new Node(head.data);
                even = temp; // Problem here
                even = even.next; // and here 
            } else { // if head.data % 2 != 0
                temp = new Node(head.data);
                odd = temp;
                odd = odd.next;
            }
            head = head.next;
        }

        toString(even);
        //toString(odd);

    }

    public void toString(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        SeperateOddEven s = new SeperateOddEven();
        head = new Node(8);
        head.next = new Node(12);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(6);

        System.out.println("original list: ");
        s.toString(head);

        s.seperate();
    }
}