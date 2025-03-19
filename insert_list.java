package day1;
import java.util.Scanner;
public class insert_list {
	    // Node class to represent each element in the list
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    // Head of the list
	    Node head;

	    // Method to insert a number at a specific position
	    public void insertAtPosition(int data, int position) {
	        Node newNode = new Node(data);

	        // If inserting at the head (position 0)
	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        // Traverse to the node just before the specified position
	        Node temp = head;
	        for (int i = 0; temp != null && i < position - 1; i++) {
	            temp = temp.next;
	        }

	        // If the position is out of bounds
	        if (temp == null) {
	            System.out.println("Position out of bounds.");
	            return;
	        }

	        // Insert the new node at the specified position
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    // Method to print the linked list
	    public void printList() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        insert_list list = new insert_list();

	        // Ask user for how many numbers they want to insert
	        System.out.print("How many numbers do you want to insert initially? ");
	        int n = scanner.nextInt();

	        // Insert the numbers entered by the user initially
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            int data = scanner.nextInt();
	            list.insertAtPosition(data, i);  // Insert at the end by using the index
	        }

	        // Ask user for a position and a number to insert
	        System.out.print("Enter the position to insert a new number: ");
	        int position = scanner.nextInt();
	        System.out.print("Enter the number to insert: ");
	        int data = scanner.nextInt();

	        // Insert the number at the specified position
	        list.insertAtPosition(data, position);

	        // Print the linked list after insertion
	        System.out.println("Linked List after insertion:");
	        list.printList();

	        scanner.close(); // Close the scanner
	    }
	}


