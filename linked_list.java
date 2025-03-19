package day1;
import java.util.Scanner;
public class linked_list {
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

	    // Method to insert a number at the end of the linked list
	    public void insert(int data) {
	        Node newNode = new Node(data);

	        // If the list is empty, the new node becomes the head
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        // Traverse to the last node
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }

	        // Insert the new node at the end
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
	        linked_list list = new linked_list();

	        // Ask user for the number of elements they want to insert
	        System.out.print("How many numbers do you want to insert? ");
	        int n = scanner.nextInt();

	        // Insert the numbers entered by the user
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            int data = scanner.nextInt();
	            list.insert(data);
	        }

	        // Print the linked list after inserting the numbers
	        System.out.println("Linked List after insertion:");
	        list.printList();

	        scanner.close(); // Close the scanner to prevent resource leak
	    }
	}

