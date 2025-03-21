package day1;
	import java.util.Scanner;

	class circular_delete {
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

	    // Method to insert a new node at the end of the circular linked list
	    public void insertAtEnd(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            tail.next = head; // Point the tail's next to head to make it circular
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head; // Ensure the last node still points to the head
	        }
	    }

	    // Method to delete the node at the beginning of the circular linked list
	    public void deleteAtBegin() {
	        if (head == null) {
	            System.out.println("The list is empty, nothing to delete.");
	        } else if (head == tail) {
	            // If there's only one node in the list
	            head = null;
	            tail = null;
	        } else {
	            // More than one node in the list
	            head = head.next;  // Update head to the next node
	            tail.next = head;  // Update the tail's next to the new head to maintain circularity
	        }
	    }

	    // Method to display the circular linked list
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

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        circular_delete list = new circular_delete();

	        // Ask user how many values they want to insert initially
	        System.out.print("Enter the number of values to insert into the circular linked list initially: ");
	        int n = scanner.nextInt();

	        // Insert values at the end to create the initial list
	        System.out.println("Enter " + n + " values to insert at the end:");
	        for (int i = 0; i < n; i++) {
	            int value = scanner.nextInt();
	            list.insertAtEnd(value);
	        }

	        // Display the circular linked list
	        System.out.print("Circular Linked List after initial insertion: ");
	        list.display();

	        // Delete a value at the beginning
	        list.deleteAtBegin();
	        System.out.print("Circular Linked List after deleting the beginning node: ");
	        list.display();

	        scanner.close();
	    }
	}


