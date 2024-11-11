package com.dsa_bootcamp_assignments.Z_Practice.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    //    InsertFirst
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head != null) {
            node.next = head;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    //    InsertLast
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //    Insert
    public void insert(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    //    Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    //    DeleteFirst
    public int deleteFirst() {
        int temp = head.val;
        head = head.next;

        size--;
        return temp;
    }

    //    DeleteLast
    public int deleteLast() {
        int temp = tail.val;
        if (size == 1) {
            deleteFirst();
            return temp;
        }
        Node tempNode = head;
        while (tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        tail = tempNode;

        size--;
        return temp;
    }

    //    DeleteWithIndex
    public int delete(int index) {
        if (index == 0) {
            int temp = head.val;
            deleteFirst();
            return temp;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int tempVal = temp.next.val;
        temp.next = temp.next.next;
        return tempVal;
    }


    public class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    //    Questions
//    Recursive Insertion
    public Node insertRec(int val, int index, Node next) {
        if (index == 0) {
//            Node node = new Node(val);
//            node.next = next;
            Node node = new Node(val, next);
            size++;
            return node;
        }

        next.next = insertRec(val, index - 1, next.next);
        return next;
    }

    //    Main
    public static void main(String[] args) {
        LL list = new LL();
        list.display();

        list.insert(0, 0);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(1, 10);
        list.insert(0, 10);

//        list.deleteLast();
//        list.deleteLast();

//        list.deleteFirst();
//        list.deleteFirst();

        list.delete(0);
        list.delete(1);
        list.delete(2);
        list.display();

        list.insertRec(6, 0, list.head);
        list.display();
    }
}