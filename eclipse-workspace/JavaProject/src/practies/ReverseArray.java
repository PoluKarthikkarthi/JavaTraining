package practies;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		 
		n=sc.nextInt();  
		
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		
		System.out.println(Arrays.toString(array));  
		System.out.println("Reverse an array:");
		
		for(int i=array.length-1; i>=0; i--)
	         System.out.print(array[i] + "  ");
		
		System.out.println("\nSorting  an array:");
		 Arrays.sort(array);   
		
		for (int i = 0; i < array.length; i++) 
		  System.out.print(array[i] + " ");   
		 
	}
}
