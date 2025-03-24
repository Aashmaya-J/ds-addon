package day1;
import java.util.Scanner;
public class binary_logic {
		public int findMyValue(int a[],int middle,int find,int l,int r)

		{

			int left=l;

			int right=r;

			while(left<=right)

			{

				middle=(left+right)/2;

				if(a[middle]==find)

				{

					System.out.println("Item found"+a[middle]);

					System.out.println("at index"+middle);

					       break;

				}

					       else if(find>a[middle]) {

					    	   left=middle+1; }

					       else if(find<a[middle]) {

					    		right=middle-1; } }

			return middle; }

		public static void main(String[] args) {

			binary_logic b=new binary_logic();

			Scanner sc=new Scanner(System.in);

			int arr[]=new int[50];

			System.out.println("Enter an size");

			int size=sc.nextInt();

			for(int i=0;i<size;i++) {

				arr[i]=sc.nextInt();

			}

			for(int i=0;i<size;i++) {

				System.out.println("Enter your value to find?");

				   int find=sc.nextInt();

				   int left=0;

				   int right=size-1;

				   int middle=0;

				 System.out.println(b.findMyValue(arr, middle, find,left,right));

			}

		}

	}			      
	
	
	
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


