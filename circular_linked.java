package day1;
	import java.util.Scanner;

	class circular_linked {
	    // Node class
	    static class Node {
	        int data;
	        Node next;

	        // Constructor
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node head = null;
	    Node tail = null;

	    // Method to insert a new node at the beginning of the circular linked list
	    public void insertAtBegin(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            tail.next = head; // Point the tail's next to head to make it circular
	        } else {
	            newNode.next = head;
	            head = newNode;
	            tail.next = head; // Ensure the last node still points to the new head
	        }
	    }

	    // Method to display the list
	    public void display() {
	        if (head == null) {
	            System.out.println("The list is empty.");
	            return;
	        }

	        Node current = head;
	        do {
	            System.out.print(current.data + " ");
	            current = current.next;
	        } while (current != head);

	        System.out.println();
	    }

	    // Method to search for a value in the list
	    public boolean search(int value) {
	        if (head == null) {
	            return false;
	        }

	        Node current = head;
	        do {
	            if (current.data == value) {
	                return true;
	            }
	            current = current.next;
	        } while (current != head);

	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        circular_linked list = new circular_linked();

	        // Ask user how many values they want to insert
	        System.out.print("Enter the number of values to insert into the circular linked list: ");
	        int n = scanner.nextInt();

	        // Insert values at the beginning
	        System.out.println("Enter " + n + " values to insert at the beginning:");
	        for (int i = 0; i < n; i++) {
	            int value = scanner.nextInt();
	            list.insertAtBegin(value);
	        }

	        // Display the circular linked list
	        System.out.print("Circular Linked List after inserting at the beginning: ");
	        list.display();

	        // Search for a value in the list
	        System.out.print("Enter a value to search for: ");
	        int searchValue = scanner.nextInt();
	        if (list.search(searchValue)) {
	            System.out.println(searchValue + " is found in the list.");
	        } else {
	            System.out.println(searchValue + " is not found in the list.");
	        }

	        scanner.close();
	    }
	}


