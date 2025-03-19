package day1;
import java.util.Scanner;
public class reverse_array {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Ask for the size of the array
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();
	        	        // Initialize the array
	        int[] array = new int[size];
	        	        // Get array elements from the user
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }
	        	        // Reverse the array
	        int left = 0;
	        int right = size - 1;
	        while (left < right) {
	            // Swap the elements
	            int temp = array[left];
	            array[left] = array[right];
	            array[right] = temp;
	            	            // Move the pointers
	            left++;
	            right--;
	        }
	        	        // Display the reversed array
	        System.out.println("Reversed array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	        	        // Close the scanner
	        scanner.close();
	    }
	}
