package day1;
	import java.util.Scanner;
	import java.util.ArrayList;

	public class fibonacci_series{

	    // Function to generate Fibonacci series up to n numbers
	    public static ArrayList<Integer> fibonacci(int n) {
	        ArrayList<Integer> series = new ArrayList<>();
	        generateFibonacci(series, n);
	        return series;
	    }

	    // Recursive helper function to fill the Fibonacci series
	    private static void generateFibonacci(ArrayList<Integer> series, int n) {
	        if (n <= 0) {
	            return;
	        }
	        int size = series.size();
	        if (size == 0) {
	            series.add(0);  // First Fibonacci number
	        } else if (size == 1) {
	            series.add(1);  // Second Fibonacci number
	        } else {
	            int nextFib = series.get(size - 1) + series.get(size - 2);  // Sum of last two numbers
	            series.add(nextFib);  // Add the next Fibonacci number
	        }
	        generateFibonacci(series, n - 1);  // Recursively call for the next number
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Ask user for input
	        System.out.print("Enter the number of terms you want in the Fibonacci series: ");
	        int n = scanner.nextInt();
	        
	        // Get the Fibonacci series and display it
	        ArrayList<Integer> fibonacciSeries = fibonacci(n);
	        System.out.println("Fibonacci Series up to " + n + " terms: " + fibonacciSeries);
	        
	        scanner.close();
	    }
	}


