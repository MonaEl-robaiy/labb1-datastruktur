package com.company;

public class LinkedList {


    private Node head;

    public int size(){
        if (head == null){
            return 0;
        }
        else {
            int i = 1;
            Node n = head;
            while(n.next != null ){
                n = n.next;
                i++;
            }
            return  i;
        }
    }
    public int get(int index){
        int i = 0;
        Node n = head;
        while (i < index){
            n = n.next;
            i++;
        }
       return n.value;
        }


    public void add(int v) {
        if (head == null) {
            head = new Node(v);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
        }
    }
    class Node{
        protected int value;
        protected Node next;
    public Node(int v){
        this.value = v;

    }
    }
}
