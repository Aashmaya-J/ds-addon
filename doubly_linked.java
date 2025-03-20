package day1;
	import java.util.Scanner;
	class Node {
	    int data;
	    Node next;
	    Node prev;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	class DoublyLinkedList {
	    Node head;

	    public DoublyLinkedList() {
	        this.head = null;
	    }

	    // Method to append a new node at the end of the list
	    public void append(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }
	        last.next = newNode;
	        newNode.prev = last;
	    }

	    // Method to print the list (for verification purposes)
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + (temp.next != null ? " <-> " : "\n"));
	            temp = temp.next;
	        }
	    }

	    // Method to clone the doubly linked list
	    public DoublyLinkedList clone() {
	        if (head == null) {
	            return null; // Return null if the list is empty
	        }

	        // Step 1: Create a map to store the mapping from original nodes to new nodes
	        java.util.Map<Node, Node> originalToCopy = new java.util.HashMap<>();

	        // Step 2: Create new nodes and store the mapping from original nodes to new nodes
	        Node current = head;
	        while (current != null) {
	            originalToCopy.put(current, new Node(current.data));
	            current = current.next;
	        }

	        // Step 3: Set the next and prev pointers for the new nodes
	        current = head;
	        while (current != null) {
	            Node copiedNode = originalToCopy.get(current);
	            if (current.next != null) {
	                copiedNode.next = originalToCopy.get(current.next);
	            }
	            if (current.prev != null) {
	                copiedNode.prev = originalToCopy.get(current.prev);
	            }
	            current = current.next;
	        }

	        // Step 4: Create a new DoublyLinkedList and set its head to the copied head
	        DoublyLinkedList clonedList = new DoublyLinkedList();
	        clonedList.head = originalToCopy.get(head);
	        return clonedList;
	    }
	}

	public class doubly_linked {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create a new doubly linked list
	        DoublyLinkedList dll = new DoublyLinkedList();

	        // Get the number of nodes from the user
	        System.out.print("Enter the number of nodes in the doubly linked list: ");
	        int n = scanner.nextInt();

	        // Get the data for each node from the user
	        System.out.println("Enter the values for the nodes:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter value for node " + (i + 1) + ": ");
	            int value = scanner.nextInt();
	            dll.append(value); // Append the new value to the list
	        }

	        System.out.println("Original List:");
	        dll.printList(); // Print the original list

	        // Clone the list
	        DoublyLinkedList clonedDll = dll.clone();

	        System.out.println("Cloned List:");
	        clonedDll.printList(); // Print the cloned list

	        scanner.close(); // Close the scanner
	    }
	}



