package day1;
import java.util.Scanner;
public class deleting_array {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // Get the size of the array from the user
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Create an array of the specified size
	        int[] arr = new int[size];

	        // Get the elements of the array from the user
	        System.out.println("Enter " + size + " elements for the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Display the original array
	        System.out.println("Original array:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        // Get the position (1-based) to delete
	        System.out.print("Enter the position  of the element to delete: ");
	        int position = scanner.nextInt();
	        

	        // Shift elements to the left from the given position (1-based to 0-based conversion)
	        for (int i = position - 1; i < arr.length - 1; i++) {
	            arr[i] = arr[i + 1];
	        }

	        // Set the last element to 0 or a default value
	        arr[arr.length - 1] = 0;

	        // Display the updated array
	        System.out.println("Array after deletion:");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }
	}



