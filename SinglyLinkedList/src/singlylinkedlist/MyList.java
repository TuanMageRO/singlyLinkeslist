/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlylinkedlist;

/**
 *
 * @author HP
 */
public class MyList {
    protected Node head = null;
    protected Node tail = null;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addBefore(int x, Node p) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node newNode = new Node(x);

        if (head == p) {
            addFirst(x);
            return;
        }

        Node current = head;
        while (current != null && current.next != p) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node p not found in the list");
            return;
        }

        newNode.next = p;
        current.next = newNode;
    }

    public void addAfter(int x, Node p) {
        if (p == null) {
            System.out.println("Given node p is null");
            return;
        }

        Node newNode = new Node(x);
        newNode.next = p.next;
        p.next = newNode;

        if (p == tail) {
            tail = newNode;
        }
    }

    public void insert(int x, int position) {
        Node newNode = new Node(x);

        if (position == 1) {
            addFirst(x);
            return;
        }

        Node current = head;
        int index = 1;
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == tail) {
            tail = newNode;
        }
    }

    public void deleteFirstAppear(int x) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.value == x) {
            deleteFirst();
            return;
        }

        Node current = head;
        while (current.next != null && current.next.value != x) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found in the list");
            return;
        }

        current.next = current.next.next;

        if (current.next == null) {
            tail = current;
        }
    }

    public void deleteAll(int x) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (head != null && head.value == x) {
            deleteFirst();
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.value == x) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        tail = current;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void traverse() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current.next != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println(current.value);
    }
}