package day1;

import java.util.Scanner;

class ListNode {
    int value;
    ListNode next;

    // Constructor
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class middle_element {

    // Function to find the middle element of the linked list
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list with the two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;         // move slow pointer by 1 step
            fast = fast.next.next;    // move fast pointer by 2 steps
        }

        return slow;  // slow pointer will be at the middle when fast reaches the end
    }

    // Utility method to print the linked list (for testing)
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to create a linked list from user input
    public ListNode createLinkedListFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes in the linked list: ");
        int n = scanner.nextInt();
        
        if (n == 0) return null;  // If no nodes are to be created
        
        System.out.print("Enter the value of node 1: ");
        int value = scanner.nextInt();
        ListNode head = new ListNode(value);
        ListNode current = head;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter the value of node " + i + ": ");
            value = scanner.nextInt();
            current.next = new ListNode(value);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        middle_element list = new middle_element();
        Scanner scanner = new Scanner(System.in);

        // Create a linked list based on user input
        ListNode head = list.createLinkedListFromUserInput();

        // Print the list
        System.out.print("Linked List: ");
        list.printList(head);

        // Find the middle element
        ListNode middle = list.findMiddle(head);
        if (middle != null) {
            System.out.println("Middle element: " + middle.value);
        } else {
            System.out.println("The list is empty.");
        }
    }
}


	    